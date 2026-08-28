//package lambdaexpression;

class A{
     public void show(){
        System.out.println("in parent file");
     }
     public void display(){
        System.out.println("2 method ");
     }
}
interface c{
    public void getdata();
}
public class lamvda {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("in inner class");
            }
             public void display(){
                System.out.println(" 2 method in inner class");
            }
                };
                obj.display();
                obj.show();
                c obj1=()-> {
System.out.println("inteface lambda expression");
                };
                obj1.getdata();
    }
}
