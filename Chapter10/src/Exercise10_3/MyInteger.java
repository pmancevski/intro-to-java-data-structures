package Exercise10_3;

public class MyInteger {
    private int value;

    public   MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) return false;

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(MyInteger number) {
        return number.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger number) {
        return number.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger number) {
        if (number.getValue() <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number.getValue()); i++) {
            if (number.getValue() % i == 0)
                return false;
        }

        return true;
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger number) {
        return this.value == number.getValue();
    }

    public static int parseInt(char[] chars){
        StringBuilder stringBuilder = new StringBuilder();

        for (int count = 0; count < chars.length; count++) {
            if (Character.isDigit(chars[count])) {
                stringBuilder.append(chars[count]);
            }
            // should have else for if char is not digit
        }

        return Integer.parseInt(stringBuilder.toString());
    }

    public static int parseInt(String string){
        return Integer.parseInt(string);
    }
}
