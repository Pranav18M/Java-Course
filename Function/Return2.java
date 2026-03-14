package Function;

public class Return2 {

    
    int getSum(int num1 , int num2)
    {
       int add = num1 + num2;
       return add;
    }

    String getName(String name)
    {
        return name;
    }

    public static void main(String[] args) {
        
    Return2 obj = new Return2();
    Return2 obj1 = new Return2();
    int total = obj.getSum(20,20);
    System.out.println(total);
    String names = obj1.getName("Pranav");
    System.out.print(names);
    }
}

