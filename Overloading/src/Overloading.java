/**
 * Created by MK on 2016-12-14.
 */
public class Overloading{
    int sum(int a,int b)
    {
        int c = a+b;
        return c;
    }
    void sum(double a,double b)
    {
        System.out.println(a+b);
    }
    void empsal(int sal)
    {
        System.out.print("salary is" + sal);
    }

    public static void main(String args[]){
        Overloading add=new Overloading();
        add.sum(22.5,10.5);
        add.sum(60,20);

    }
}
