public class StringByTechCoder {
    public static void  main(String[] args){
        String intro = "we are Tech Coders";
        // print this variable
        System.out.println(intro);

 //✌️        concatenate two string
        String A = "hey my name is ";
        String B = "Chiku";
        System.out.println(A+B);

//✌️    Charector position
        String C = "Tech Coder";
        System.out.println(C.charAt(0));

//✌️   Length of a String
            String D = "hey This is TechCoder ";
        System.out.println("Length this string is "+D.length());

//✌️   Replace Word

        String E = "Tech Coder";
        System.out.println(E.replace("T","A"));

//✌️  SubString (Print Specific sentence)
        String F = "We are Tech Coder ";
        System.out.println(F.substring(7,18));
}
}