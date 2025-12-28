
public class StaticExample {
    int membervariable = 10;
    static int classvariable = 20;
    public void method1(){
        membervariable = 100; // non static method can access both static and non static variable
        classvariable = 400;
        System.out.println("this is method 1, value of membervariable is: "+ membervariable);
        System.out.println("this is method 1, value of class variable is: "+ classvariable);
    }
    public static void method2(){
        classvariable = 200; // static method can only access static variables and methods
        System.out.println("this is staic method, class variable is: "+ classvariable);
    }
}

/*

static method cannot access non static variables and methods -> as they belong to objects and static methods don't know variables of which 
object to be modified.

to call non static method in static method , we have to make object inside it first then call the method using it
as it will then know which object's method to call


*/
