//package collections;
class Generics <T>{
    private T ref;
    public Generics(T ref){
        this.ref=ref;
    }
    public void disp(T ref){
        System.out.println("display"+ref.getClass().getName());
    }
 public T getref(){
    //System.out.println(T);
    return ref;
 }   
}
public class generrics {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>(44);
           g.disp(44);
           System.out.println(g.getref());
    }
}
