package interfaces;
interface calc{
    void add(int a ,int b);
    void sub(int a ,int b);
}
class  calc1 implements calc{
      public   void add(int a ,int b){
     int res=a+b;
     System.out.println(res);
      }
     public void sub(int a ,int b){
int res=a-b;
System.out.println(res);
     }
}
class calc2 implements calc{
    public   void add(int a ,int b){
int n1=a;
int n2=b;
int res=n1+n2;
System.out.println(res);
      }
     public void sub(int a ,int b){
       int n1=a;
int n2=b;
int res=n1-n2;
System.out.println(res);
     }
}
// interfaces ref can be used to acieve polymorphism
class Algebra{
    public void cal(calc c,int a,int b){
        c.add(a,b);
        c.sub(a,b);
    }
}
public class interfaces1 {
    public static void main(String[] args) {
        calc c1= new calc1();
        calc c2= new calc2();
        Algebra a1= new Algebra();
        a1.cal(c1, 20, 30);
    }
}
