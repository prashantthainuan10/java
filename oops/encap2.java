//ackage oops;
class thiskeyword{
int id;
String name;
void setid( int id){
    this.id=id;
}
void setname(String name ){
    this.name=name;
}
int getid(){
    return id ;
}
 String getname(){
    return name;
}
    
}
public class encap2 {
    public static void main(String[] args) {
        thiskeyword a= new thiskeyword();
        a.setid(6);
        a.setname("prashant");
        System.out.println(a.getid());
        System.out.println(a.getname());
    }
    
}
