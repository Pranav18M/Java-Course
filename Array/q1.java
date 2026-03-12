package Array;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int[] mark = new int[5];

        for(int i=0;i<=4;i=i+1){
            mark[i] = scan.nextInt();
            System.out.println(mark[i]);
        }
        }

}