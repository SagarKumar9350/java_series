public interface Bird {

    
    //private int value = 10; // error -> only public,static,final is permitted
     void canFly(); //methods are by default "public static"


     //private method is allowed after java9 but implementation has to be given
    // private void newmethod(){
    //     System.out.println("new method inside bird");
    // }
}
