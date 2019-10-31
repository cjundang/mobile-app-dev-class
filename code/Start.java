public class Start{
    
    public static void main(String [] args){
        Person p1 = new Person("Chanankorn","Jandaeng", 35);  // create object from class
        Person p2 = new Person("Chatchanan", "Jandaeng", 32);
        Person p3 = p2;
        p3.setAge(-10);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p3.age);
    }
}
