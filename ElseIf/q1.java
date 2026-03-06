package ElseIf;

public class q1 {
    public static void main(String[] args) {
         int score = 99;

         if(score>35 && score<=60){
            System.out.print("Video game");
         }
         else if(score>61 && score<=90){
        System.out.print("Iphone");
         }
         else if(score>90){
            System.out.print("MAC OS");
         }
         else{
            System.out.print("Manda polaka poguthu");
         }
    }
}
