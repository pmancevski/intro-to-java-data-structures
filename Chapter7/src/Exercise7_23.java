public class Exercise7_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int student = 1; student <= lockers.length; student++){
            for (int locker = student - 1; locker < lockers.length; locker += student) {
                lockers[locker] = !lockers[locker];
            }
        }

        printArray(lockers);
    }

    public static void printArray(boolean[] array){
        for (int count = 0; count < array.length; count++){
            if (array[count]){
                System.out.print("L" + (count + 1) + " ");
            }
        }
    }
}
