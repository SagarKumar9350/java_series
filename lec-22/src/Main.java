import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer>values = new ArrayList<>();
        System.out.println("is collection empty: "+values.isEmpty());
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        Iterator<Integer>valueItr = values.iterator(); // Iterator was already present ,its just Iterable interface is added
        System.out.println("iterator method");

        while(valueItr.hasNext()){
            int val = valueItr.next();
            System.out.println(val);
            if(val == 3){
                valueItr.remove();
            }
        }

        System.out.println("for each loop");
        for(int val: values){
            System.out.println(val);
        }

        System.out.println("for each method");
        values.forEach((Integer val)-> System.out.println(val));

        System.out.println("is collection empty: "+values.isEmpty());
    }
}
