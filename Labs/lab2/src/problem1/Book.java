package problem1;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages){
        super(title, author, publicationYear );
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    @Override
    public String toString(){
        return super.toString() + ", Pages: " + numberOfPages;
    }
}
