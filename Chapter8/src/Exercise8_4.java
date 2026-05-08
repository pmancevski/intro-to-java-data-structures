public class Exercise8_4 {
    public static void main(String[] args) {
        int[][] workingHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[][] employeeIndexHours = new int[workingHours.length][2];

        for (int row = 0; row < workingHours.length; row++) {
            int weeklyHours = 0;

            for (int col = 0; col < workingHours[row].length; col++) {
                weeklyHours += workingHours[row][col];
            }

            employeeIndexHours[row][0] = row;
            employeeIndexHours[row][1] = weeklyHours;
        }

        for (int row = 0; row < workingHours.length; row++) {
            int maxIndex = row;

            for (int column = row + 1; column < workingHours.length; column++) {
                if (employeeIndexHours[column][1] > employeeIndexHours[maxIndex][1])
                    maxIndex = column;
            }

            int[] temp = employeeIndexHours[row];
            employeeIndexHours[row] = employeeIndexHours[maxIndex];
            employeeIndexHours[maxIndex] = temp;
        }

        for (int row = 0; row < workingHours.length; row++) {
            System.out.println("Worker " + employeeIndexHours[row][0] + "'s weekly hours are " + employeeIndexHours[row][1]);
        }
    }
}
