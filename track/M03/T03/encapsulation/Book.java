public class Book{
    private int pagenum;
    // public void setData(int x){
    //     pagenum=x;
    // }
    // public void getData(){
    //     System.out.println(pagenum);
    // }
    public void setData(int x){
        if(x>0){
            pagenum=x;
        }
    }
    public int getData(){
       return pagenum;
    }

}