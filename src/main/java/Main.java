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
                System.out.println("Enter name:");
                String vardas = inputReader.nextLine();
                System.out.println("Enter last name:");
                String pavarde = inputReader.nextLine();
                User vart = new User(vardas, pavarde);
                int stop1 = 0;
                while(stop1 == 0) {
                    System.out.println("--User--" + vart.vardas + ' ' + vart.pavarde);
                    System.out.println("1. Show Available Books:");
                    System.out.println("2. Borrow Book from Library and get Record:");
                    System.out.println("3. Show Record:");
                    System.out.println("--User--");

                    input = inputReader.nextLine();
                    c = input.charAt(0);
                    switch (c) {
                        case '1':
                            lib.showAvailBooks();
                            break; // optional

                        case '2':
                            System.out.println("Enter book name");
                            input = inputReader.nextLine();
                            System.out.println(input);
                            if (lib.checkBook(input)) {
                                // knyga ir paimta is bibliotekos ir yra israsomas recordas vartotojui
                                System.out.println("Book found");
                                lib.BookTaken(input);
                                vart.getRecord(input, vart.vardas, vart.pavarde);


                            } else {
                                System.out.println("Book not found");
                            }
                            break; // optional

                        case '3':
                            vart.showRecords();
                            break; // optional

                        case '4':
                            stop1 = 1;
                            break; // optional

                        // You can have any number of case statements.
                        default: // Optional
                            // Statements
                            break; // optional
                    }
                }
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
