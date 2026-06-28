package inheritance;
class Alpha {
    int a,b;
    public Alpha(){
        a=10;
        b=220;
        System.out.println("zero parameter constructor");
    }
    public Alpha(int a,int b){
this.a=a;
this.b=b;
System.out.println("parameterized constructor");
    }
}
class Beta extends Alpha{
    
}
public class accessspecifier {
    public static void main(String[] args) {
        
    }
}
