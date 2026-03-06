package IfElse;
import java.util.Scanner;

public class q4 {
     public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    
    if(num%3==0 && num%5==0)
    {
      System.out.println("num is dividible by 3 and 5");
    }
    else{
     System.out.print("num is not dividible by 3 and 5");
}
}
}
