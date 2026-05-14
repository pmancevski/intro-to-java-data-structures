package Exercise13_11;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct1 = new Octagon(5);
        System.out.println("Area: " + oct1.getArea());
        System.out.println("Perimeter: " + oct1.getPerimeter());

        Octagon oct2 = (Octagon) oct1.clone();

        System.out.println("oct1 equals oct2? " + (oct1.compareTo(oct2) == 0));
    }
}
