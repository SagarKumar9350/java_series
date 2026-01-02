public class Eagle implements Bird{
    @Override
    public void canFly(){ //not declaring access specifier make it "default" , while interface have "public" method by defalut
     //that lead to reduce the visiblility and compiler time error occurs
        System.out.println("Eagle can fly method");
    }
}
