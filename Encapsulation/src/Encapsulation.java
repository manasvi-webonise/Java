/**
 * Created by MK on 2016-12-27.
 */
class Encap {
    private String name = "Manasvi";
    private int age = 21;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class Encapsulation {
        public static void main(String args[]){
            Encap obj = new Encap();
            System.out.println(obj.getName());
            //System.out.println(obj.name); fails as name is declared ad private and can only be accessed by methods of that class
        }

}
