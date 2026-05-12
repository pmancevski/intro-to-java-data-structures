package Exercise10_22;

public class App {
    public static void main(String[] args) {
        char[] chars = {'P', 'e', 'T', 'a', 'r'};

        MyString1 string1 = new MyString1(chars);
        String str = "PeTar";

        //get value
        System.out.println(string1.getValue());
        System.out.println();

        System.out.println("MyString1 class charAt(): " + string1.charAt(3));
        System.out.println("String class charAt(): " + str.charAt(3));
        System.out.println();

        System.out.println("MyString1 class length(): " + string1.length());
        System.out.println("String class length(): " + str.length());
        System.out.println();

        System.out.println("MyString1 class substring(): " + string1.substring(1, 4).getValue());
        System.out.println("String class substring(): " + str.substring(1, 4));
        System.out.println();

        System.out.println("MyString1 class tolowercase(): " + string1.toLowerCase().getValue());
        System.out.println("String class tolowercase(): " + str.toLowerCase());
        System.out.println();

        char[] chars1 = {'P', 'e', 'T', 'a', 'R'};

        MyString1 string2 = new MyString1(chars1);

        System.out.println("Testing equals(): " + string1.equals(string2));


    }
}
