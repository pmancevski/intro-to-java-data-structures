// Because all methods are identical and static as previous exercise i used like that so i dont copy and paste
public class Exercise6_27 {
    public static void main(String[] args) {

        int count = 0;
        int numberToCheck = 11;
        int newLine = 0;

        while (count <= 100){

            if (Exercise6_26.isPrime(numberToCheck) && !Exercise6_26.isPalindrome(numberToCheck)){
                int temp = Exercise6_26.reverse(numberToCheck);

                if (Exercise6_26.isPrime(temp)){
                    System.out.print(numberToCheck + " ");
                    count++;
                    newLine++;

                    if (newLine % 10 == 0){
                        System.out.println();
                    }
                }
            }

            numberToCheck++;
        }
    }
}
