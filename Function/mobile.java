package Function;

public class mobile {
    
    void iphone(){
        System.out.println("This is iphone");
    }
    void samsang(){
        System.out.println("This is samsang");

    }
    void Oppo(){
        System.out.print("This is oppo");
    }

    public static void main(String[] args) {
        
        mobile obj1 = new mobile();
        obj1.iphone();

        mobile obj2 = new mobile();
        obj2.samsang();

        mobile obj3 = new mobile();
        obj3.Oppo();
    }


}
