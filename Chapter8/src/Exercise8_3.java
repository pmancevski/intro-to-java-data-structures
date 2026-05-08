public class Exercise8_3 {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentIndexScore = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            studentIndexScore[i][0] = i;
            studentIndexScore[i][1] = correctCount;

//            System.out.println("Student " + i + "'s correct count is " +
//                    correctCount);
        }

        for (int row = 0; row < answers.length; row++) {
            int minIndex = row;

            for (int column = row + 1; column < answers.length; column++) {
                if (studentIndexScore[column][1] < studentIndexScore[minIndex][1])
                    minIndex = column;
            }

            int[] temp = studentIndexScore[row];
            studentIndexScore[row] = studentIndexScore[minIndex];
            studentIndexScore[minIndex] = temp;
        }

        for (int row = 0; row < answers.length; row++) {
            System.out.println("Student " + studentIndexScore[row][0] + "'s correct count is " + studentIndexScore[row][1]);
        }
    }
}
