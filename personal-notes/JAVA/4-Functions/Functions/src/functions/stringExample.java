package functions;

public class stringExample {
    public static void main(String[] args) {
    String string1 = greet();
    System.out.print(string1);
    }
    static String greet() {
        String greeting = "Yo bro!";
        return greeting;

  }
}


/*
taking input from user in Java:


0. Import java.util package
1. Declare the datatype
2. create object of scanner class, using:
    Scanner obj = new Scanner(System.in);
    System is a class and "in" is a static member of the class.
3. nextInt() is a method of scanner class;
4. Sout("Enter Value");
5. a = obj.nextInt();



 */