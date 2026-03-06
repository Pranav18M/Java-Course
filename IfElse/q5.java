// Find the number Even or Odd
package IfElse;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if(num%2==0){
           System.out.print("Even number");
        }
        else{
           System.out.print("Odd number");

        }
    }
}
