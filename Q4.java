import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) 
    {
    
        Scanner user = new Scanner(System.in);

        String name = user.nextLine();
        double score = user.nextInt();
        user.nextLine();
        String department = user.nextLine();

        System.out.println("Name:"+name);
        System.out.println("Score:"+score/10+"/10");
        System.out.println("Name:"+department);

    }
}
