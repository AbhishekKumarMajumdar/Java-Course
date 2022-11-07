class Student {
    String Name;
    int Age ;

    public void printinfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }
}


class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("type Somthinks....");
    }
    public void colorPrint(){
        System.out.println(this.color);
    }
        }
public class OOPS {
    public static void main (String args[]){
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";
        pen1.colorPrint();
        pen2.colorPrint();

        Student s1 = new Student();
        s1.Name = "chiku";
        s1.Age = 24;
        s1.printinfo();
    }
}
