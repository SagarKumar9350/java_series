import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer>values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println("size is: "+ values.size());
        System.out.println("is Empty: "+values.isEmpty());
        System.out.println("contains: "+values.contains(5));
        values.add(5);
        System.out.println("contains: "+values.contains(2));
        values.remove(3);
        System.out.println("removed using index: "+values.contains(3));
        values.remove(Integer.valueOf(3));
        System.out.println("remove using object: "+values.contains(3));

        Stack<Integer>stackvalues = new Stack<>();
        stackvalues.add(6);
        stackvalues.add(7);
        stackvalues.add(8);

        values.addAll(stackvalues);
        System.out.println("values contain stackvalues: "+values.containsAll(stackvalues));
        values.remove(Integer.valueOf(7));
        System.out.println("values contain stackvalues: "+values.containsAll(stackvalues));
        values.removeAll(stackvalues);
        System.out.println("removeAll: "+values.contains(8));
        values.clear();
        System.out.println("is values empty: "+values.isEmpty());

    }
}
