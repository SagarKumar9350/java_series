public interface LivingBird {
    void canFly();

    default void canRun(){
        System.out.println("Default canRun method from LivingBird class");
    }

}
