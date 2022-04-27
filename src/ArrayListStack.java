import java.util.ArrayList;

public class ArrayListStack<T> {

    
    private ArrayList<T> data = new ArrayList<T>();

    public void put(T element){
        data.add(element);
    }


    public T peek(){
        if(data.size() > 0){
            return data.get(data.size()-1);
        }
        return null;
    }

    public T pop(){
        T el = peek();

        if(el != null){
            data.remove(el);
        }

        return el;
    }

    
}
