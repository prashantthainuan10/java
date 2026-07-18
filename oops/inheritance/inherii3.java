package inheritance;
class State{

}
class City{

}
//  methid overridden 
class Animal{
 public void eat(){
    System.out.println("eat anything ");
 }
 public State n(){
    System.out.println("name");
    State s = new State();
    return s;

 }
}
class Tiger extends Animal   {
 public void eat(){
    System.out.println("EAT FLESh ");
 }
 public city n (){
    City c = new City();
    return c ;// this
 }
}
public class inherii3 {
    public static void main(String[] args) {
         
    }
}
