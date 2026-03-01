package OOPS;

public class Book3 {
    static int totalBooks;
    String title;
    String author;
    int isbn;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book3(String title, String author, int isbn){
        this.title = "Hello world";
        this.author = "auth";
        this.isbn = 17;
    }

    public void borrowbook(){
        totalBooks -= totalBooks;
    }

    public void returnbooks(){
        totalBooks += totalBooks;
    }

    public static int getTotalbooks(){
        return totalBooks;
    }

}
