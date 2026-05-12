package Exercise10_22;

public class MyString1 {

    private char[] elements;

    public MyString1(char[] chars){
        this.elements = chars;
    }

    public String getValue() {
        StringBuilder sb = new StringBuilder();

        for (char c : elements) {
            sb.append(c);
        }

        return sb.toString();
    }

    public char charAt(int index){
        return elements[index];
    }

    public int length(){
        return elements.length;
    }


    public MyString1 substring(int begin, int end){
        char[] chars = new char[end - begin];

        int count = 0;
        for (int i = begin; i < end; i++){
            chars[count] = elements[i];
            count++;
        }

        return new MyString1(chars);
    }

    public MyString1 toLowerCase(){

        return new MyString1(this.getValue().toLowerCase().toCharArray());
    }

    public boolean equals(MyString1 s){
        if (this.length() != s.length()) {
            return false;
        }

        for (int i = 0; i < this.length(); i++) {
            if (charAt(i) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static MyString1 valueOf(int i){
        String string = String.valueOf(i);
        char[] chars = string.toCharArray();

        return new MyString1(chars);
    }
}
