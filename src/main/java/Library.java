import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {

    public Library(){

    }

    List<Books> ListBooks = new ArrayList<Books>();

    public void onCreate(){
        ListBooks.add(new Books("bob", "Autorius", 2014));
        ListBooks.add(new Books("bob", "Autorius", 2014));
        ListBooks.add(new Books("bob", "Autorius", 2014));
    }

    public void showBooks(){
        for(Books i : ListBooks) {
            System.out.println("Book name: " + i.Name);
            System.out.println("Book author: " + i.Author);
            System.out.println("Book year: " + i.Year);
            System.out.println("------------------------");
        }
    }
}
