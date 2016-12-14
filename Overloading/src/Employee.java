/**
 * Created by MK on 2016-12-14.
 */
public class Employee {
    public static void main(String args[]){
        int basesal = 4200;
        int tax = 200;
        Overloading sal = new Overloading();
        int salary = sal.sum(basesal,tax);
        sal.empsal(salary);

    }
}
