import java.util.Scanner;

public class Q1{

    public static void main(String[] args)
    {
        Scanner information = new Scanner(System.in);
        String Name = information.nextLine();
        int Age = information.nextInt();
        System.out.println("Name :"+Name);
        System.out.println("Age:"+Age);
    }
}