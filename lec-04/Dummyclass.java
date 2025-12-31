

public class Dummyclass {
    int membervariable;
    static int staticvariable = 100;

    Dummyclass(){
        //default constructor
    }
    Dummyclass(int a){
        //parametrized constructor
    }

    public void method(){
        int localvariable = 20; //scope only inside method
        System.out.println("this is local variable"+localvariable);
    }

    public static void main(String[] args) {
        Dummyclass d = new Dummyclass();
        System.out.println("this is member variable"+d.membervariable);
        d.method();
    }
}
