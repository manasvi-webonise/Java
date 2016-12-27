/**
 * Created by MK on 2016-12-27.
 */
 abstract class Employee {
    private String name;
    private String address;
    private int number;

    public abstract double computePay(double sal);

    public String getName(){
        String name = "Ayush";
        return name;

    }
}


 class Salary extends Employee {
    private double salary;

    public double computePay(double sal) {
        System.out.println("Computing salary pay for " + getName() + ":" +sal);
        return salary;
    }
}

public class Abstraction {
    public static void main(String args[]){
        Salary sal = new Salary();
        double salary = sal.computePay(6000);
    }
}
