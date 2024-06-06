package ThucHanh.ThucHanh5;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jhon","Carter",22,true);
        Person p2 = new Person("May","Leona",23,false);
        System.out.println(p1.getFirstName());
        System.out.println("Name p2: " + p2.getFirstName()+""+p2.getLastName());
    }
}
