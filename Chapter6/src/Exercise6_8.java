public class Exercise6_8 {
    public static void main(String[] args) {

        System.out.printf("%10s%16s%4s%13s%13s%n%s%n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius",
                "---------------------------------------------------------");

        double fahrenheit = 120.0;
        for (double celsius = 40.0; celsius >= 31.0; celsius--) {
            System.out.printf("%7.1f%17.1f%6s%11.1f%13.1f%n", celsius, celsiusToFahrenheit(celsius), "|",
                    fahrenheit, fahrenheitToCelsius(fahrenheit));

            fahrenheit -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5.0) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}
