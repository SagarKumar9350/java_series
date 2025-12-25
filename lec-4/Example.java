
public class Example {
    public static void main(String[] args) {
        char var = 98;
        long val = 100L;
        System.out.println(var);
        System.out.println(val);

        //example of promotion
        byte a = 127;
        byte b = 1;
        // byte c = a+b;  here afer sum a+b it crossed the limit of byte so it will promoted to int that's why byte c , can't hold it 
        int c = a+b; // as a result we are using int c to hold a+b
        System.out.println(c);
        
    }
}
