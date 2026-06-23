//package oops;
  class Demo2 {
 static int a,b,c;
    int x,y,z;
    static{
        System.out.println("static");
        a=5;
        b=9;
        c=2;
    }
    static void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    {
        //java initialisation block after the object creation or before constructor call it is initialised
        x=24;
        y=234;
        z=244;
    }
    Demo2(){
        System.out.println("constructor");
    }
    void disp2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    }
public class statickeyword2 {
    public static void main(String[] args) {
        Demo2.disp();
        Demo2 d2=new Demo2();
        d2.disp2();
    }
}
