package oops;

class Calc{
    int num;
    int num2;
    void add(){
        num=2;
        num2=5;
        int sum=num + num2;
        System.out.println(sum);
    }
}
public class oops2 {
    public static void main(String[] args) {
        Calc s = new Calc();
        s.add();
    }
}
