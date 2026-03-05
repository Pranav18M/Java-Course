import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner sum = new Scanner(System.in);
        
        int a = sum.nextInt();
        int b = sum.nextInt();
        int c = sum.nextInt();
        
        int d=a*b*c;
        int e=a+b+c;
        int div = d/e;

        System.err.println("Anser is:"+div);
    }

}
