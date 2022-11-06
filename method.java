import java.util.Scanner;
public class method {
    public static void print(){
        System.out.println("i am Method");
    }
    public static void printName(String Name){
        System.out.println("Walcome "+Name);
    }
    public static void printSum(int a , int b){
        System.out.println(a+b);
    }
    public static void main(String [] args){
        System.out.println("i am main function");
        print();
        print();
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name here :");
        String Name = a.next();
        printName(Name);
        printSum(50,50);
    }
}
