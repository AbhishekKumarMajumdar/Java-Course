import java.util.Arrays;
public class ArraysByTechCoder {
    public static void main(String [] args){
        int [] marks = new int [3];
            marks[0]=50;
            marks[1]=30;
            marks[2]=40;
        System.out.println(marks[2]);

//✌️    second type of Arrays define
        int [] main = {10,50,5};
        System.out.println(main[2]);

//✌️ Length of the Array
        System.out.println(main.length);

//✌️ Sort the array
        int [] S = {15,12,54,65,2,5,8};
        Arrays.sort(S); //import (Java.util.Arrays) in header
        System.out.println(S[0]);

//✌️  2D Arrays
        int [] [] chiku = {{11,12,13,14},{21,22,23,24}};
        System.out.println(chiku[0][1]);

//✌️  Casting
        int p = 100;
        int fp = p+(int)18.00;
        System.out.println(fp);

//✌️  Constants
        final float Pi = 3.14F; // now This variable can't be change
        System.out.println(Pi);


    }
}
