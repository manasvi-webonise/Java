/**
 * Created by MK on 2016-12-27.
 */
//RUN TIME POLYMORPHISM
class Employee{
    void checkSalary(int sal){
        System.out.println("Average Salary of an employee is"+ sal);
    }
}
class Manager extends Employee{
    void checkSalary(int sal) {
        System.out.println("Salary of Manager is"+ sal);
    }

}
public class ObjectReference {
    public static void main(String args[]) {
        Employee emp = new Employee();
        Manager man = new Manager();
        emp.checkSalary(2000);
        man.checkSalary(5000);
        Employee emp1 = new Manager();
        //Manager man1 = new Employee(); (This fails)
        emp1.checkSalary(1000);
        //man1.checkSalary(4000);

    }
}
