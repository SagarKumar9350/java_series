public class ObjectTest {
    public static void main(String[] args) {
        OuterClass.NestedClass nestObj = new OuterClass.NestedClass(); // for static nested class
        //for inner class we have to first make an object to access the class
        //example: OuterClass.Innerclass innerClassObj =  outerClassObj.new InnerClass();
        nestObj.print();
    }
}
