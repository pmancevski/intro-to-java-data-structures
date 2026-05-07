import java.util.Arrays;

public class Exercise7_34 {
    public static void main(String[] args) {
        String string = "acb";

        System.out.println(sort(string));
    }

    public static String sort(String s){
        char[] charArray = s.toCharArray();

        // most sufficient way
        //Arrays.sort(charArray);

        for (int count = 0; count < charArray.length; count++){
            for (int i = count + 1; i < charArray.length; i++){
                if (charArray[count] >  charArray[i]){
                    char temp = charArray[count];
                    charArray[count] = charArray[i];
                    charArray[i] = temp;
                }
            }
        }

        return  new String(charArray);
    }
}
