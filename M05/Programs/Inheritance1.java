package M05.Programs;
class Parent{
    Parent(){
        System.out.println("Inside 0 parent constructor");
    }
   

}
class child extends Parent {
    child(){
        this(5);
        System.out.println("child constructor");
    }
    child(int a){
        this(10,20);
        System.out.println("child 1 constructor");
    }
    child(int a,int b){
        System.out.println("child 2 constructor");
    }
   

}
public class Inheritance1 {
    public static void main(String[] args) {
        child c=new child();
    }
}
