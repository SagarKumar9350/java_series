

public class Student {

    public static void main(String[] args) {
        Person t = new Teacher();
        System.out.println(t.profession());
        Person e = new Engineer();
        System.out.println(e.profession());
        Teacher t2 = new Teacher();
        System.out.println(t2.profession());
        Engineer e2 = new Engineer();
        System.out.println(e2.profession());
        
    }
}
