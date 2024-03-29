# Mobile Application Development

<img src="me.png" alt="drawing" width="200"/>


**Course Description**

Introduction to mobile programming; software development tools; mobile programming language; construct and design user interface; create different types of graphic image; create and store data; mobile application development; software distribution channels.

**Grade Policy**

| Activity  | Percent |
| -------------| ------------- |
|Class Attendance	| 5|
|6 Online Quiz 	|12|
|Workshop with Assignment (11 x 3 )	|33|
|Project	|20|
|Final	|30|
|**Total**	|**100**|


**Outlines**
- Week 01 : Introduction to mobile programming
- Week 02 - 04 : Install Android Studio and Hello World Program, Single User Interface Application
- Week 05  : Multi User Interface Application
- Week 06 : Advance User Interface Application
- Week 07 : Data Storage
- Week 08 - 09 : Services
- Week 10 - 11 : Connect to Internet 

**Extra 12 Hr**
- 4 Hr : Java Programming for Android Programmer
- 8 Hr : React Native Mobile Application

## Workshop 1 : Java Programming for Android Programmer

**Outlines**
- Install Java compiler and tools
- Compile and Execure Java Class file 
- Basic instructions: data type, condition, loop, function
- OOP concept: Class and Object, Encapsulation, Inheritance, Polymorphism

### Installation
- download and install JavaSe https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html
- Set JAVA_HOME path details in https://javatutorial.net/set-java-home-windows-10

### Compile and Execute
- create file named Main.java
```
class Main{
    public static void main(String []args){
        System.out.println("Hello");
    }
}
```
- compile 
```
> javac Main.java
```
- run
```
> java Main
```
### Basic Instruction
- Create new file named Start.java, compile and execute.
```
class Start{
    public static void main(String []args){
        System.out.println("Hello");
    }
}
```
- Test the command in cheat sheet page 1 in topics of ata type and conversion, loop, condition
    - Variable
```
class Start{
    public static void main(String []args){
        int a = 10;
        double b = 10.0;
        char c = 'c';
        boolean d = true;
        String e = "Name";

        System.out.println("Hello " + a + " " + b + " " + c + " " + d + " " + e);
    }

}
```
    - Mathematics libary: more detail google with Math Class Java example
```
class Start{
    public static void main(String []args){
        double result = Math.sqrt(3);
        System.out.println("="+result);
    }

}
```  
```
class Start{
    public static void main(String []args){
        int sum = 0;
        for(int i=1; i <50; i++){
            if(i % 2 == 0)
                sum += i;
        }        
        System.out.println("="+sum);
    }
}
```
```
class Start{
    public static void main(String []args){
        System.out.println( 11 * 0.25);
        System.out.println( (int)11 * 0.25);
        System.out.println( 11 * (int)(0.25 + 0.5) );
        System.out.println( (int)(0.25 + 0.5) );
        System.out.println( (int)(0.65 + 0.5) );
        System.out.println( (int)(11 * 0.25));
    }

}
```  
- Learning how to use array and its iterative function 
```

import java.util.Random;
class Start{
    public static void main(String []args){
        int n = 10;
        int seed = 1;
        Random generator = new Random(seed);
        double []a = new double[n];
        for(int i=0; i < n;i++){
            //a[i] = Math.random();
            a[i] = generator.nextDouble();
        }
        for(int i=0; i < n;i++)
            System.out.println(a[i]);
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0; i < n;i++)
            if(a[i] > max) max = a[i];
        System.out.println("max = " + max);
    }
}
```
Fibonacci
```
class Fibo{
    public static void main(String[] args){
        int n1=0,n2=1,n3,i,n=10;    
        System.out.print(n1+" "+n2);
        for(i=2;i<n;++i){    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }
        System.out.println();    
    }
    
}
```
- Function in Java
- String and its function

### OOP
- Class and Object
   - Class is blueprint = propoties + method
   - Class is none-function
   - Create Object from class
```
public class Start{
    public static void main(String [] args){
        Person p1 = new Person();  // create object from class
        p1.fname = "Chanankorn";
        p1.lname = "Jandaeng";
        p1.age = 35;

        p1.showData();
    }
}
```  
```
public class Person{
    // property
    String fname;
    String lname;
    int age;
    // method

    public void showData(){
        System.out.println("> " + this.fname);
        System.out.println("> " + this.lname);
        System.out.println("> " + this.age);
    }
}
``` 
- Constructor


- Encapsulation
```

public class Person{
    // property
    private String fname;
    private String lname;
    private int age;
    // default constructor
    /*
        public Person(){}
    */
    // constuctor
    public Person(String fname, String lname, int age){
            setFname(fname);
            setLname(lname);
            setAge(age);
    }

    // method
    public void showData(){
        System.out.println("> " + this.fname);
        System.out.println("> " + this.lname);
        System.out.println("> " + this.age);
    }
    public String toString(){
        String ret;
        ret = ">" + this.fname + " " + this.lname + " " + this.age;
        return ret;
    }

    public void setAge(int age){ // write permission
        if(age > 0)
            this.age = age;
        else  
            this.age = 0;
    }

    public int gelstAge(){ // read permission
        return this.age;
    }

    public void setFname(String fname){ // write permission
        this.fname = fname;
    }

    public String getFname(){ // read permission
        return this.fname;
    }

    public void setLname(String lname){ // write permission
        this.lname = lname;
    }

    public String getLname(){ // read permission
        return this.lname;
    }
}

```
```
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
```
- Inheritance
```
class Student extends Person{
    private String id;
    private double gpax;

    public Student(String fname, String lname, int age, String id, double gpax){
        super(fname, lname, age);
        this.id = id;
        this.gpax = gpax;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setGpax(double gpax){
        this.gpax = gpax;
    }
    public double getGpax(){
        return this.gpax;
    }

    // overriding 
    public String toString(){
        return super.toString() + " " + getId() 
            + " " + getGpax();
    }

}
```
```
    Student s1 = new Student("A", "B", 30, "11111", 3.45);      System.out.println(s1.toString());
```
- Interface
```
interface Spider{
     public void say();
     public void move();
}
```
```
class Spiderman extends Student 
        implements Spider {

     public void say(){
         System.out.println("I am Spiderman");
     };
     public void move(){
        System.out.println("Jump with Web");
     };

     public String toString(){
        return "I am " + getFname() + " " + getLname() 
            + " I am Spidermane";

     }


}
```
```
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
```

### install adroid studio
https://developer.android.com/studio