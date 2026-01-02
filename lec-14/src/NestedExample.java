public class NestedExample extends OuterClass implements OuterInterface.InnerInterface,OuterInterface,OuterClass.InnerInterface{
    @Override
    public void canFly(){
        System.out.println("CanFly of NestedExample");
    }
    @Override
    public void canRun(){
        System.out.println("CanRun of NestedExample");
    }
}
