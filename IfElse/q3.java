package IfElse;
import java.util.Scanner;

public class q3 {
    
    public static void main(String[] args) 
    {
       Scanner user = new Scanner(System.in);
       
       int num1 = user.nextInt();
       int num2 = user.nextInt();

       if(num1==num2){
        System.out.println("The numbers are equal");
       }
       else{
        System.out.println("The numbers are not equal");
       }
    }
}
