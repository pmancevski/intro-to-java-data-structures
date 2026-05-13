package Exercise12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String filePath = "Chapter12\\src\\Exercise12_17\\hangman.txt";

        char[] word = generateRandomWordToArray(filePath);
        System.out.println(Arrays.toString(word));
        char[] hiddenWord = hideWord(word);
        int tries = 0;
        char continuePlay = 'y';

        do {
            displayHiddenWord(hiddenWord);

            char userChoice = input.next().charAt(0);
            tries = checkStatus(hiddenWord, userChoice, tries);
            guessWord(word, hiddenWord, userChoice);

            if (isComplete(hiddenWord)){
                printStatistic(word, tries);
                continuePlay = input.next().charAt(0);

                if (continuePlay == 'y'){
                    word = generateRandomWordToArray(filePath);
                    System.out.println(Arrays.toString(word));
                    hiddenWord = hideWord(word);
                    tries = 0;
                }
            }
        }
        while (continuePlay == 'y');

    }

    public static char[] generateRandomWordToArray(String filePath){
        File file = new File(filePath);

        if (!file.exists()){
            System.out.println("File does not exist. Cannot generate random word.");
            System.exit(0);
        }

        ArrayList<String> words = new ArrayList<>();

        try (Scanner input = new Scanner(file)){
            while (input.hasNextLine()){
                String line = input.nextLine();

                String[] tempWord = line.split(" ");

                for (int i = 0; i < tempWord.length; i++){
                    words.add(tempWord[i]);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String[] strings = words.toArray(new String[0]);

        return strings[(int) (Math.random() * strings.length)].toCharArray();
    }

    public static char[] hideWord(char[] word){
        char[] returnArray = new char[word.length];
        for (int count = 0; count < word.length; count++){
            returnArray[count] = '*';
        }

        return returnArray;
    }

    public static void displayHiddenWord(char[] word){
        System.out.print("(Guess) Enter a letter in word ");

        for (int count = 0; count < word.length; count++){
            System.out.print(word[count] + " ");
        }

        System.out.print(" > ");
    }

    public static void guessWord(char[] word, char[] hiddenWord, char guess){

        for (int count = 0; count < word.length; count++){
            if (word[count] == guess){
                hiddenWord[count] = guess;
            }
        }
    }

    public static int checkStatus(char[] hiddenWord, char character, int tries){
        for (int count = 0; count < hiddenWord.length; count++){
            if (hiddenWord[count] == character){
                System.out.println("\t" + character + " is already in the word");
                return tries + 1;
            }
        }

        return tries;
    }

    public static boolean isComplete(char[] hiddenWord){
        boolean complete = true;

        for (int count = 0; count < hiddenWord.length; count++){
            if (hiddenWord[count] == '*'){
                return false;
            }
        }

        return complete;
    }

    public static void printStatistic(char[] word, int tries){
        String wordString = "";

        for (int count = 0; count < word.length; count++){
            wordString += word[count];
        }

        System.out.println("\nThe word is \"" + wordString + "\". You missed " + tries +
                (tries > 1 ? " times" : " time"));
        System.out.print("Do you want to guess another word? Enter y or n > ");
    }
}
