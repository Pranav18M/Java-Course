package Function;

public class Return {
    
    int getmilk(int money)
    {
       int milk_price = 25;
       int rem = 25 - money;
       return rem;
    }

    public static void main(String[] args) {
        
        Return obj = new Return();
        int remainder = obj.getmilk(15);
        System.out.print(remainder);
        
    }
}

