package Function;
import java.util.Scanner;

public class Find {
    
    void getEvenorOdd(int num)
    {
        if (num % 2 == 0) {
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }

    public static void main(String[] args) {
      
        Find obj1 = new Find();
        Scanner scan = new Scanner(System.in);
        int input =scan.nextInt();
        obj1.getEvenorOdd(input);

    }
}
