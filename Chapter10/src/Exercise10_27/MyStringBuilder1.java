package Exercise10_27;

public class MyStringBuilder1 {
    private String element;

    public MyStringBuilder1(String element) {
        this.element = element;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){

        return new MyStringBuilder1(this.element + s.element);
    }

    public MyStringBuilder1 append(int i){
        return new MyStringBuilder1(this.element + i);
    }

    public int length(){
        return element.length();
    }

    public char charAt(int index){
        return element.charAt(index);
    }

    public MyStringBuilder1 toLowerCase(){
        return new MyStringBuilder1(element.toLowerCase());
    }

    public MyStringBuilder1 substring(int begin, int end){
        return new MyStringBuilder1(element.substring(begin, end));
    }

    @Override
    public String toString(){
        return element;
    }
}
