public class Main {
    public static void main(String[] args) throws Exception {
        Bird obj1 = new Eagle(); // here we can create object of inteface Bird but it can hold reference of its child class objects
        Bird obj2 = new Hen();
        obj1.canFly();
        obj2.canFly();

        Bird newBirdObj = new NewBird(); // multiple inheritance using interface
        newBirdObj.canFly();

        OuterInterface outerobj = new NestedExample();
        OuterInterface.InnerInterface innerobj = new NestedExample();
        NestedExample nestedobj = new NestedExample();
        outerobj.canFly();
        innerobj.canRun();
        nestedobj.outerclassmethod1();

        OuterClass outerclassobj = new OuterClass();
        outerclassobj.outerclassmethod1();
    }
}
