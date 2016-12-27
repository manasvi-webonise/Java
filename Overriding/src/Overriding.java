/**
 * Created by MK on 2016-12-27.
 */
class Area {
    void area(int l, int b){
        int calc;
        calc = l*b;
        System.out.println("Area of Rectangle is" + calc);
    }
}

class AreaExample extends Area {
    void area(int l, int b){
        int calc = l*b;
        System.out.println("Area of square is" + calc);
    }
}
public class Overriding {
    public static void main(String args[]) {
        AreaExample obj = new AreaExample();
        obj.area(7, 7);
    }
}