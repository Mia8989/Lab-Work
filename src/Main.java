import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner keys = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = keys.nextLine();
        System.out.printf("Hello %s\n",firstName);

        //ask if person wants to continue?


        System.out.println("Do you wish to continue? ");

        System.out.print("Y/N: ");
        String response = keys.nextLine();
        Boolean flag= response.equalsIgnoreCase("Y");
        Boolean approved = (response.equals("Y") || response.equals("y")) ? true: false;

        if (approved) {
            System.out.println ("Do you have a nice car?");
        }



    }
}

