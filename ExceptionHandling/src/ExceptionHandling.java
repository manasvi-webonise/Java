/**
 * Created by MK on 2016-12-27.
 */
public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
    }
}
