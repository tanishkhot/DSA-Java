import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter your fruit name");
        Scanner x = new Scanner(System.in);
        String fruit = x.next();

//        // This is a new type of if statement in Java
//        if (fruit.equals("Mango")) {
//            System.out.println("King");
//        }
//
//        if (fruit.equals("Apple")) {
//        System.out.print("Red fruit");
//        }

        switch (fruit) {
            case "Mango" -> System.out.println("King");
            case "Apple" -> System.out.println("Apple");
            default -> System.out.print("End");
        }
        // This is like conditionals without the
        //conditions. This does not work without break
        // with break, this works exactly like a if-else ladder
        // Duplicate cases are not allowed
        // Use option command to convert to enhanced switch
            }

}
