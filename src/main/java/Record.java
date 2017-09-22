import org.joda.time.LocalDate;

public class Record {
    public String UName;
    public String ULast;
    String BookName;
    LocalDate dateOfRecord = new LocalDate();
    LocalDate twoMonthLater = dateOfRecord.plusMonths(2);
    public boolean isReturned = false;

    public Record(String BookName, String UName, String ULast){
        this.BookName = BookName;
        this.isReturned = isReturned;
        this.UName = UName;
        this.ULast = ULast;
    }

    public void getDateRet(){
        System.out.println("Date book taken:");
        System.out.println(dateOfRecord);
        System.out.println("Date book must be returned:");
        System.out.println(twoMonthLater);
    }

    public void isBookReturned(){
        if(!isReturned){
            System.out.println("Book is not returned!");
        }else{
            System.out.println("Book is returned.");
        }
    }

}
