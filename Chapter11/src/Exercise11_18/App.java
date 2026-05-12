package Exercise11_18;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> characters = new ArrayList<>();

        for (int count = 0; count < s.length(); count++) {
            characters.add(s.charAt(count));
        }

        return characters;
    }
}
