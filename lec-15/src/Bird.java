public interface Bird {
    public void canFly();

    default void canRun(){
        System.out.println("Default canRun method from Bird class");
    }

    static void canBreath(){
        System.out.println("canBreath method from Bird class");
    }
}
