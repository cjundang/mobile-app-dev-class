class Student extends Person{
    private String id;
    private double gpax;
    public Student(){};
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