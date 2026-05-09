package Exercise9_9;

public class App {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon 1: %n\tPerimeter: %.2f%n\tArea: %.2f%n%n",
                regularPolygon.getPerimeter(), regularPolygon.getArea());
        System.out.printf("Polygon 2: %n\tPerimeter: %.2f%n\tArea: %.2f%n%n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf("Polygon 3: %n\tPerimeter: %.2f%n\tArea: %.2f%n%n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
    }
}
