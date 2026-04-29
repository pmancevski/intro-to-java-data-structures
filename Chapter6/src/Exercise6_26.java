public class Exercise6_26 {
    public static void main(String[] args) {
        int newLine = 0;

        for (int count = 2; count <= 1000; count++) {

            if (isPrime(count)){
                if (isPalindrome(count)){
                    System.out.print(count + " ");
                    newLine++;

                    if (newLine % 10 == 0){
                        System.out.println();
                    }
                }
            }
        }
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    //not sure if palindrome can end with 0 but in that case there is a bug, leading zero is discarded. Better approach
    //  return string and isPalindrome another loop to check based on character on the strings.
    public static int reverse(int number){
        String numberString = Integer.toString(number);
        String reverseString = "";

        for (int count = numberString.length() - 1; count >= 0; count--) {
            reverseString += numberString.charAt(count);
        }

        return  Integer.parseInt(reverseString);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
