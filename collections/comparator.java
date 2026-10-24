// whenever we have no acces to the target class we use it 

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Crickter{
 int age;
 String name;
 double avg;
 public Crickter(int age, String name, double avg) {
    this.age = age;
    this.name = name;
    this.avg = avg;
 }
 public String toString(){
    return "crickter [age= "+age+", name="+name+",avg="+avg+"]";
 }
}
class Alpha10 implements Comparator<Crickter>{
    public int compare(Crickter o1,Crickter o2){
        if(o1.avg>o2.avg){
            return 1;
        }
        else return -1;
    }
}
public class comparator {
    public static void main(String[] args) {
        Crickter c1 = new Crickter(20, "ram", 70.5);
        Crickter c2 = new Crickter(21, "shayam", 71.5);
 Crickter c3 = new Crickter(22, "sam", 72.5);        
      ArrayList<Crickter> a = new ArrayList<>();
      a.add(c1);
      a.add(c2);
      a.add(c3);
      Alpha10 a5 = new Alpha10();
      Collections.sort(a,a5);

      System.out.println(a);
    }
}
