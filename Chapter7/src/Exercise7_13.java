public class Exercise7_13 {
    public static void main(String[] args) {
        for (int count = 0; count < 45; count++){
            System.out.printf("%4d", getRandom(1,100,4,8,95,93));

            if ((count + 1) % 15 == 0){
                System.out.println();
            }
        }
    }

    public static int getRandom(int start, int end, int... numbers){
        int randomNumber;
        boolean found;

        do {
            randomNumber = start + (int)(Math.random() * end);

            found = !(-1 == searchNumber(randomNumber, numbers));
        }
        while (found);


        return randomNumber;
    }

    public static int searchNumber(int number , int[] array){
        int result = -1;

        for (int count = 0; count < array.length; count++){
            if (array[count] == number){
                result = count;
                break;
            }
        }

        return result;
    }
}
