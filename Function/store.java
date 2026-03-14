package Function;

public class store {
    
    void getChoclate(int money)
    {
         System.out.println(money);
         System.out.println("get kikkat");
    }

    void getPowder(int money)
    {
        System.out.println(money);
        System.out.print("get powder");
    }

    public static void main(String[] args) {
        
        store user = new store();
        user.getChoclate(5);
        user.getPowder(20);
    }
}
