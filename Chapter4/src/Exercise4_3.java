public class Exercise4_3 {
    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01;

        final double ATLANTA_LATITUDE = Math.toRadians(33.7489954);
        final double ATLANTA_LONGITUDE = Math.toRadians(-84.3879824);
        final double CHARLOTTE_LATITUDE = Math.toRadians(35.2270869);
        final double CHARLOTTE_LONGITUDE = Math.toRadians(-80.8431267);
        final double SAVANNAH_LATITUDE = Math.toRadians(32.0835407);
        final double SAVANNAH_LONGITUDE = Math.toRadians(-81.0998342);
        final double ORLANDO_LATITUDE = Math.toRadians(28.5383355);
        final double ORLANDO_LONGITUDE = Math.toRadians(-81.3792365);

        double distanceAtlantaCharlotte = EARTH_RADIUS *
                Math.acos(Math.sin(ATLANTA_LATITUDE) * Math.sin(CHARLOTTE_LATITUDE)
                        + Math.cos(ATLANTA_LATITUDE) * Math.cos(CHARLOTTE_LATITUDE)
                        * Math.cos(ATLANTA_LONGITUDE - CHARLOTTE_LONGITUDE));

        double distanceCharlotteSavannah = EARTH_RADIUS *
                Math.acos(Math.sin(CHARLOTTE_LATITUDE) * Math.sin(SAVANNAH_LATITUDE)
                        + Math.cos(CHARLOTTE_LATITUDE) * Math.cos(SAVANNAH_LATITUDE)
                        * Math.cos(CHARLOTTE_LONGITUDE - SAVANNAH_LONGITUDE));

        double distanceSavannahOrlando = EARTH_RADIUS *
                Math.acos(Math.sin(SAVANNAH_LATITUDE) * Math.sin(ORLANDO_LATITUDE)
                        + Math.cos(SAVANNAH_LATITUDE) * Math.cos(ORLANDO_LATITUDE)
                        * Math.cos(SAVANNAH_LONGITUDE - ORLANDO_LONGITUDE));

        double distanceOrlandoAtlanta = EARTH_RADIUS *
                Math.acos(Math.sin(ORLANDO_LATITUDE) * Math.sin(ATLANTA_LATITUDE)
                        + Math.cos(ORLANDO_LATITUDE) * Math.cos(ATLANTA_LATITUDE)
                        * Math.cos(ORLANDO_LONGITUDE - ATLANTA_LONGITUDE));

        double distanceAtlantaSavannah = EARTH_RADIUS *
                Math.acos(Math.sin(ATLANTA_LATITUDE) * Math.sin(SAVANNAH_LATITUDE)
                        + Math.cos(ATLANTA_LATITUDE) * Math.cos(SAVANNAH_LATITUDE)
                        * Math.cos(ATLANTA_LONGITUDE - SAVANNAH_LONGITUDE));

        double t1s = (distanceAtlantaCharlotte + distanceCharlotteSavannah + distanceAtlantaSavannah) / 2;

        double t1Area = Math.sqrt(t1s * (t1s - distanceAtlantaCharlotte) * (t1s - distanceCharlotteSavannah)
                * (t1s - distanceAtlantaSavannah));

        double t2s = (distanceSavannahOrlando + distanceOrlandoAtlanta + distanceAtlantaSavannah) / 2;

        double t2Area = Math.sqrt(t2s * (t2s - distanceSavannahOrlando) * (t2s - distanceOrlandoAtlanta)
                * (t2s - distanceAtlantaSavannah));

        double areaTotal = t1Area + t2Area;

        System.out.println("Estimated area by four cities is" + areaTotal);
    }
}
