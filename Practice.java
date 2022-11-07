import java.util.Scanner;

class Table{
    int num;

    public void printTable(){
        for(int i=1;i<=10;i++){
            System.out.println(this.num*i);
        }
    }
}

public class Practice {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scan.nextInt();
        Table t1 = new Table();
        t1.num = number;
        t1.printTable();
    }
}