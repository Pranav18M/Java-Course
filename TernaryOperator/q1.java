package TernaryOperator;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();

        System.out.print(a>b?" First number is bigger:"+a:"Secound number is bigger:"+b);
    }
}
