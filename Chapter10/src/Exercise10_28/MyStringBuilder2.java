package Exercise10_28;

public class MyStringBuilder2 {
    private String element;

    public MyStringBuilder2(){
        element = "";
    }

    public MyStringBuilder2(char[] chars){
        for(int i = 0; i < chars.length; i++){
            element += chars[i];
        }
    }

    public MyStringBuilder2(String element){
        this.element = element;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String temp = "";

        for (int count = 0; count < element.length(); count++){

            if (count < offset){
                temp += element.charAt(count);
            }
            else if (count == offset){
                for (int countS = 0; countS < s.element.length(); countS++){
                    temp += s.element.charAt(countS);
                }
            }
            else{
                temp += element.charAt(count);
            }
        }

        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 reverse(){
        String temp = "";

        for (int count = element.length() - 1; count >= 0; count--){
            temp += element.charAt(count);
        }

        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 substring(int begin) {
        return new MyStringBuilder2(element.substring(begin));
    }

    public MyStringBuilder2 toUpperCase(){
        return new MyStringBuilder2(element.toUpperCase());
    }

}
