import java.util.Scanner;
public class input {
    public static  void main(String[] args){
        Scanner a = new Scanner (System.in);
        System.out.println("Enter your Age here :");
        int age = a.nextInt();
        System.out.println(age);

        //input a Float value

        Scanner b = new Scanner(System.in);
        System.out.println("Enter any Float Value :");
        float Fb = b.nextFloat();
        System.out.println(Fb);

        //Input String

        Scanner c = new Scanner(System.in);
        System.out.println("Enter your name here :");
        String name = c.next();
        System.out.println(name);

        //Input Line
        Scanner d = new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String S = d.nextLine();
        System.out.println(S);
    }
}
