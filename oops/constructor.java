package oops;
class Dog{
    int prize;
    String color;
     public Dog(int prize,String color){
        this.color=color;
        this.prize=prize;
     }
     public int getPrize() {
         return prize;
     }
     public String getColor() {
         return color;
     }
}

public class constructor {
    public static void main(String[] args) {
        Dog d1= new Dog(50000000,"jdncnscni");
        System.out.println(d1.getColor());
        System.out.println(d1.getPrize());
    }
}
