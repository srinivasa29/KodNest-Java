public class Main1{
    public static void main(String [] args){
        Child ch1=new Child1();
        accessMethod(ch1);
        Child ch2=new Child2();
        accessMethod(ch2);
    }
    public static void accessMethod(Child c){
        c.bike();
        c.car();
    }
}