import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {

    public Library(){

    }

    List<Books> ListBooks = new ArrayList<Books>();

    public void onCreate(){
        ListBooks.add(new Books("OOP Programming", "Harry Main", 2009, true));
        ListBooks.add(new Books("Harry Potter Cursed Child", "J.K.Rowling", 2017, true));
        ListBooks.add(new Books("Not Available", "Autorius", 2014, false));
        ListBooks.add(new Books("Knyga2", "Autorius", 2014, true));
        ListBooks.add(new Books("Knyga3", "Autorius", 2014, true));
    }

    public void showAllBooks(){
        for(Books i : ListBooks) {
            System.out.println("Book name: " + i.Name);
            System.out.println("Book author: " + i.Author);
            System.out.println("Book year: " + i.Year);
            System.out.println("------------------------");
        }
    }

    public void showAvailBooks(){
        for(Books i : ListBooks){
            if(i.isEvail){
                System.out.println("Book name: " + i.Name);
                System.out.println("Book author: " + i.Author);
                System.out.println("Book year: " + i.Year);
                System.out.println("------------------------");
            }
        }
    }
    public void BookTaken(String bookName){
        for(Books i : ListBooks){
            if(i.Name.equals(bookName)){
                System.out.println("Book was found and taken");
                i.isEvail = false;
                break;
            }
        }
    }
    public Boolean checkBook(String bookName){
        for(Books i : ListBooks){
            if(i.Name.equals(bookName)){
                return true;
            }
        }
        return false;
    }
}
