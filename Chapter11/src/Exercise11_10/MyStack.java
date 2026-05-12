package Exercise11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return super.size();
    }

    public Object peek(){
        return super.get(getSize() - 1);
    }

    public Object pop(){
        return super.remove(getSize() - 1);
    }

    public void push(Object e){
        super.add(e);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
