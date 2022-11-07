class Shape {
    String Color;
    public void Sap(){
        System.out.println("hey i am a Shape");
    }
}
class Circul extends Shape{
    public void printShap(){
        System.out.println("hey i am a circul");
    }
}

public class Inheritence {
    public static void main (String args[]){
        Circul w1 = new Circul();
        w1.printShap();
        w1.Sap();

    }
}
