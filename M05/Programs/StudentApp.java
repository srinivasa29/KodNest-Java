package M05.Programs;

class Student {
    int roll;
    String name;

   
    //  @Override
    //  public boolean equals(Object o) {
    //      Student s=(Student)o;

    //    if(this.roll == s.roll && this.name == s.name){
    //     return true;
    //    }
    //    return false;

    //  }
      Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    @Override 
    public String toString(){
        return roll+ "----"  + name + "----";
    }

    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
}
class StudentApp{
    public static void main(String[]args){

       Student s1=new Student(11,"Arjun");
       Student s2=new Student(12,"Raju");
       Student s3=new Student(11,"Arjun");
        Object s4=new Student(22, "Ravi");
    //    s1.display();
    //    s2.display();
    //    s3.display();

    //    System.out.println(s1.equals(s2));
    //    System.out.println(s1.equals(s3));
    // System.out.println(s1);
    // System.out.println(s2);
    // System.out.println(s3);

    System.out.println(s1.getClass());
    System.out.println(s4.getClass());


      
    }
}