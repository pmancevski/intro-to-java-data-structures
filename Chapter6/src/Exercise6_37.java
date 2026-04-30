public class Exercise6_37 {
    public static void main(String[] args) {
        System.out.println(format(345, 6));
    }

    public static String format(int number, int width){
        String result = "";
        int countZero = width - String.valueOf(number).length();

        while (countZero > 0) {
            result += "0";
            countZero--;
        }

        return result + number;
    }
}
