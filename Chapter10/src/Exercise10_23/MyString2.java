package Exercise10_23;

public class MyString2 {

    private String value;

    public MyString2(String s){
        this.value = s;
    }

    public int compare(String s){
        return this.value.compareTo(s);
    }

    public MyString2 substring(int begin){
        return new MyString2(this.value.substring(begin));
    }

    public MyString2 toUpperCase(){
        return new MyString2(this.value.toUpperCase());
    }

    public char[] toChars(){
        return this.value.toCharArray();
    }

    public static MyString2 valueOf(boolean b){
        return new MyString2(b ? "true" : "false");
    }
}
