public class NewBird implements Bird,LivingBird {
    public void canFly(){
        System.out.println("CanFly from NewBird");
    }
    
    @Override
    public void canRun() {
        // TODO Auto-generated method stub
        //Bird.super.canRun();
        LivingBird.super.canRun();
    }

    
}
