import java.util.Scanner;

class Loan{
    float p;
    float t;
     static float r;
     void input(){
        Scanner scan = new Scanner(System.in);
        p= scan.nextFloat();
        t = scan.nextFloat();
     }
     static{
        r=2.5f;
     }
     void compute(){
        float si=(p*r*t)/100;
     }
    
}
public class statickeyword4 {
    public static void main(String[] args) {
         Loan l1 =new Loan();
         l1.input();
         l1.compute();
        
}
} 