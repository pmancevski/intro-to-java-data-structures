package Exercise9_13;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(){

    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a){
        Location location = new Location();
        location.maxValue = a[0][0];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (a[row][column] > location.maxValue) {
                    location.row = row;
                    location.column = column;
                    location.maxValue = a[row][column];
                }
            }
        }

        return location;
    }
}
