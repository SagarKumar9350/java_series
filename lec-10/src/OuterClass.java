public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{ // if private access specifier is used then it can't be accessed outside this
        public void print(){
            // System.out.println(classVariable+instanceVariable); // as it is static class it cannot access non static member of outer class
            System.out.println(classVariable);
        }
    }
}
