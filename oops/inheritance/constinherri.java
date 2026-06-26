package inheritance;
class Aeroplane{
void disp(){
    System.out.println("inherited function");
}
}
class Cargoplane extends Aeroplane{
void disp(){
    System.out.println("overridden function ");
    
}
void pre(){
    System.out.println("specialized function");
}
}

public class constinherri {
    public static void main(String[] args) {
        Aeroplane c = new Cargoplane();// upcasting
     c.disp();
    ((Cargoplane)c).pre();//downcasting
    }
}
