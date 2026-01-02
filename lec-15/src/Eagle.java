public class Eagle implements Bird{
    public void canFly(){
        System.out.println("CanFly method from Eagle class");
    }
    public void canRun(){
        System.out.println("CanRun from Eagle");
    }

    //@Override  // if we write this it will give compilation error as static method of interface can't be override 
    //so it will act like hiding it not overriding it
    public void canBreath(){
        System.out.println("canBreath method from Eagle class");
    }
}
