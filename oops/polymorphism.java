
class Aeroplane {
    public void takingoff(){
        System.out.println("tske off");
    }
    public void landing(){
        System.out.println("aeroplane is landing");
    }
}
class Cargoplan extends Aeroplane{
public void takingoff(){
        System.out.println(" cargo tske off");
    }
    
}
class Fighterplane extends Cargoplan{
    public void takingoff(){
        System.out.println("  fighter tske off");
    }
    public void fly(){
        System.out.println("fighter is flying");
    }
}
class Poly{
public void permit(Aeroplane plane){
    plane.takingoff();
    plane.landing();
}
}
public class polymorphism {
    public static void main(String[] args) {
        // to achieve runtime polymorphism parenttype refernce is neded
       // Aeroplane c = new Cargoplan();
          Aeroplane a = new Aeroplane();
          Cargoplan c =new Cargoplan();
          Fighterplane f = new Fighterplane();
          Poly  p = new Poly();
          p.permit(a);
          p.permit(c);

    }
}
