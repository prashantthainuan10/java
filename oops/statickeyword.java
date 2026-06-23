//package oops;
 class Demo {
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
}
public class statickeyword {
    public static void main(String[] args) {
        Demo.disp();
    }
}
