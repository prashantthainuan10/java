class Alien{
    static {
        System.out.println("first static");
    }
    static {
        System.out.println("secomd static");
    }
    {
        System.out.println("first initialisatio bloc");
    }
    {
        System.out.println("second javaa initialization block");
    }
}
public class statickeyword3 {
    public static void main(String[] args) {
        Alien a1 =new Alien();
        Alien a2 = new Alien();
    }
}
