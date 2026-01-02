public class Main {
    public static void main(String[] args) throws Exception {
        Bird obj1 = new Eagle();
        Bird obj2 = new Hen();
        obj1.canFly();
        obj2.canFly();
        obj1.canRun(); // here both canRun() come from Bird as it is default we haven't overrided it in child classes
        obj2.canRun();

        Bird newbirdobj = new NewBird();
        newbirdobj.canFly();
        newbirdobj.canRun();

        //static method from Bird class
        Bird.canBreath();

        Eagle obj3 = new Eagle(); 

        obj3.canBreath(); //canBreath was present in Eagle so i have to make obj3 that is referenced by Eagle
    }
}
