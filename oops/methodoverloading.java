//package oops;
class addition{
   int add(int n,int n2){
        return n+n2;
    }
    int add(int n,int n2,int n3){
        return n+n2+n3;
    }
    double add(int n,double n2){
        return n+n2;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        int x= 3;
        int y=5;
        int z=5;
        double d=3.5;
        addition a = new addition();
        System.out.println(a.add(z, d));
        System.out.println(a.add(y, x));
    }
}
