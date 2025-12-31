
// example of class

public class Employee {
    int empId = 1;

    public int getid(){
        return empId;
    }
    public void update(Employee emp){
        emp.empId = 20;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e2 = e;
        e.update(e);
        e2.empId = 5;
        System.out.println(e.empId);
        System.out.println(e2.empId);
    }
}
