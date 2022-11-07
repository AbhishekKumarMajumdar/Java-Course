class Poly{
    String name;
    int age ;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age){
        System.out.println(name + " "+age);
    }

}

public class Polymorphism {
    public static void main(String args[]){
        Poly a1 = new Poly();
        a1.name="abhi";
        a1.age=24;

        a1.printinfo(a1.name);
        a1.printinfo(a1.age);
        a1.printinfo(a1.name,a1.age);
    }
}
