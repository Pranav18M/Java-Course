package CodingChallenge;
import java.util.Scanner;

public class q2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int sub1 = scan.nextInt();
        int sub2 = scan.nextInt();
        int sub3 = scan.nextInt();
        int sub4 = scan.nextInt();
        int sub5 = scan.nextInt();
        
        int add = sub1+sub2+sub3+sub4+sub5;
        int avarage = add/5;

        if(avarage<35){
            System.out.print("Additional class required");
        }
        else{
            System.out.print("You are good to go");
        }
    }
}
