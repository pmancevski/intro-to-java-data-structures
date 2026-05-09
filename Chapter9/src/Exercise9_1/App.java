package Exercise9_1;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.printf("Rectangle1: %n\tWidth: %.2f%n\tHeight: %.2f%n\tArea: %.2f%n\tPerimeter: %.2f%n%n",
                rectangle.width, rectangle.height, rectangle.getArea(), rectangle.getPerimeter());
        System.out.printf("Rectangle2: %n\tWidth: %.2f%n\tHeight: %.2f%n\tArea: %.2f%n\tPerimeter: %.2f%n%n",
                rectangle2.width, rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());
    }
}
