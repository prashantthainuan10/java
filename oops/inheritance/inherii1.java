package inheritance;
class Parent{
int age ;
void show(){
   age =10;
   System.out.println(age);
}
}
class Child extends Parent{

}
class Son extends Child{

}
public class inherii1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        Son s= new Son();
        s.show();
    }
}
