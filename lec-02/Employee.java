
public class Employee {
    
    public static void main(String []args){
        int a = -10;
        System.out.println("lecture 2nd");
        System.out.println("output of a is: "+ a);
    }
}


/*

->portability(wora): write once run anywhere

(java program) -> compiler -> (bitecode) -> jvm -> (machine code) -> cpu -> output

3 main components
1) jvm: java vitrual machine, its an abstract machhine
    it is platform dependent, (java program is platform independent)
    it has jit compiler
2) jre: java runtime environment
    jvm + class libraries(java.Math,java.util,etc.)
3) jdk: java development kit
    progam languages(.java),compiler(javac),debugger

All three are platform dependent but (java code -> byte code) is platform independent

JSE(java standard edition) -> core java 
JEE(java enterprise edition)/jakarta EE -> jse + api's(transaction{rollback,commit},servlets,jsp)
JME(java micro/mobile edition) -> api's for mobile edition


first java program 
    file name == class name
    1 file can only have 1 public class
    main() is the starting point of the program 
    public static void main() :
        public -> it can be called from anywhere
        static -> so that jvm doesn't need to create an object to use the method
        void -> as it has no return type

*/