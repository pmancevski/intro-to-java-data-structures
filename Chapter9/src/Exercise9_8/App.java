package Exercise9_8;

public class App {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.printf("Fan 1:%n%s", fan);

        System.out.printf("Fan 2:%n%s", fan2);
    }
}
