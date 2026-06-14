package oops;
class Book{
     private int pgno;
     void setpageno( int pageno){
           pgno= pageno;
     }
    void disp(){
        System.out.println("page no."+ pgno);
    }

}
public class encap {
    public static void main(String[] args) {
        Book book = new Book();
        book.setpageno(4);
       //  System.out.println(book.pgno);
book.disp();
        }
    
}
