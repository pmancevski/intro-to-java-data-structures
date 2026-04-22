public class Exercise5_23 {
    public static void main(String[] args) {
        double rightToLeft = 0;

        for (int count = 50000; count > 0; count--) {
            rightToLeft += 1.0 / count;
        }

        double leftToRight = 0;

        for (int count = 1; count <= 50000; count++) {
            leftToRight += 1.0 / count;
        }

        System.out.println("Right to left: " + rightToLeft);
        System.out.println("Left to right: " + leftToRight);

        if (rightToLeft == leftToRight) {
            System.out.println("We dont have cancelation error");
        }
        else  {
            System.out.println("We have cancelation error");
        }
    }
}
