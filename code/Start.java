public class Start{
    
    public static void main(String [] args){
        Person p1 = new Person("Chanankorn","Jandaeng", 35);  // create object from class
        Person p2 = new Person("Chatchanan", "Jandaeng", 32);
        Person p3 = p2;
        p3.setAge(-10);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        Student s1 = new Student("A", "B", 30, "11111", 3.45);
        System.out.println(s1.toString());
        Spiderman sp1 = new Spiderman();
        sp1.say();
        sp1.move();
        sp1.setFname("Peter");
        sp1.setLname("Parker");
        sp1.setAge(16);
        System.out.println(sp1.toString());
    }

}
