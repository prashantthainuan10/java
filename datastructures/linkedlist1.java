class Listnode{
    int data;
    Listnode next;
    Listnode(int data){
        this.data=data;
       this.next=null;
    }
    public  void add(int data){
        Listnode head = null;
        
      Listnode newnode=new Listnode(10);
      Listnode current=head;
      if(head == null){
        head= newnode;
        }
        

        while(current.next!=null){
            current=current.next;
            current.next=newnode;
        }
        
      //head.next=newnode;
    }
}
public class linkedlist1 {
    public static void main(String[] args) {
         
    }
}
