package M05.polymorphism;
class Developer{
    void work(){
        System.out.println("Developer working");
    }
    void project(){
        System.out.println("Developer doing project");
    }
}
public class JavaDeveloper extends Developer{
    @Override 
    void work(){
        System.out.println("Java Developer working");
    }
    @Override 
    void project(){
        System.out.println("Java Developer doing project");
    }
}
class PythonDeveloper extends Developer{
    @Override 
    void work(){
        System.out.println("Python Developer working");
    }
    @Override 
    void project(){
        System.out.println("Python Developer doing project");
    }
}

class run {
    public static void main(String [] args){
        JavaDeveloper jd=new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd=new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer d){
        d.work();
        d.project();
    }
    
}
