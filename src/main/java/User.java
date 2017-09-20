import java.util.ArrayList;
import java.util.List;

public class User {
    String vardas;
    String pavarde;
    int NrOfBooks;

    List<Record> BookRecords = new ArrayList<Record>();

    public User(String vardas, String pavarde){
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public void getRecord(String bookName, String UserName, String UserLast){
        BookRecords.add(new Record(bookName, UserName ,UserLast));
        for(Record i : BookRecords) {
            if(i.BookName.equals(bookName)){
            System.out.println("Book name: " + i.BookName);
            i.getDateRet();
            System.out.println("------------------------");
            }
        }
    }
    public void showRecords(){
        for(Record i : BookRecords) {
                System.out.println("Book name: " + i.BookName);
                i.getDateRet();
                System.out.println("------------------------");
            }
        }
    }
