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