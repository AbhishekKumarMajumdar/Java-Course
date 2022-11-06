import java.util.Scanner;
public class miniProject {
   public static void main(String [] args){
       System.out.println("Gussa the number 1 to 100");
       int num = 0;
       int ran = (int)(Math.random()*100);
       Scanner a = new Scanner(System.in);

       do{
           num = a.nextInt();
           if(num==ran){
               System.out.println("WooHoo you won the game");
               break;
           }
           else if(num>ran){
               System.out.println("your number is too large");
           }
           else{
               System.out.println("your number is too small");
           }
       }while(num>=0);
   }
}
