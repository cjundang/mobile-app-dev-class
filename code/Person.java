
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

    public int getAge(){ // read permission
        return this.age;
    }

    public void setFname(String fname){ // write permission
        this.fname = fname;
    }

    public int getFname(){ // read permission
        return this.fname;
    }

    public void setLname(String lname){ // write permission
        this.lname = lname;
    }

    public int getLname(){ // read permission
        return this.lname;
    }
}
