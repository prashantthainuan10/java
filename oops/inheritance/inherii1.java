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
public class inherii1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
