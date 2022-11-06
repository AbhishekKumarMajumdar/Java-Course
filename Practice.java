import java.util.Scanner;
public class Practice {
    public static void main(String [] args){
        System.out.println("Enter the number :");
        Scanner num = new Scanner(System.in);
        int table = num.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i*table);
        }
    }
}
