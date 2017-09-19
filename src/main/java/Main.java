import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //student result system
    int stop = 1;
    Library lib = new Library();
    lib.onCreate();


    System.out.println("LIBRARY CONSOLE APP");

    while(stop != 0) {
        System.out.println("--Meniu--");
        System.out.println("Only numbers, first number is read");
        System.out.println("1. User Login");
        System.out.println("2. ");
        Scanner inputReader = new Scanner(System.in);
        String input = inputReader.nextLine();
        char c = input.charAt(0);
        switch (c) {
            case '1':
                System.out.println("--User--");

                String input = inputReader.nextLine();
                char c = input.charAt(0);
                switch(c) {
                    case '1' :
                        // Statements
                        break; // optional

                    case '2' :
                        // Statements
                        break; // optional

                    case '3' :
                        // Statements
                        break; // optional

                    case '4' :
                        // Statements
                        break; // optional

                    // You can have any number of case statements.
                    default : // Optional
                        // Statements
                }
                break; // optional

            case '2':
                System.out.println("antras");
                break; // optional

            // You can have any number of case statements.
            default: // Optional
                // Statements
        }
    }

    }
}
