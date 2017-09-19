public class Books {
    public String Name;
    public String Author;
    public int Year;
    public boolean isEvail = true;

    public Books(String Name, String Author, int Year){
        this.Name = Name;
        this.Author = Author;
        this.Year = Year;
    }

    public void bookTaken(){
        isEvail = false;
    }

    public void bookReturned(){
        isEvail = true;
    }
}
