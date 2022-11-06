public class loop {
    public static void main(String [] args){

        // For
        System.out.println("For Loop");
        for(int i=1;i<=10;i++){
            System.out.println(i*5);
        }

        //while
        System.out.println("While Loop");
        int n = 1;
        while(n<=10){
            System.out.println(n*2);
            n++;
        }
        //Do While
        System.out.println("DO while Loop");
        int x = 10;
        do{
            System.out.println(x);
            x--;
        }while(x>=1);
    }
}
