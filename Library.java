//7) implement classes for a Library
//There are diffrent type of books are available in the
//library like Printed books, E books, and Audio books

//You must use inheritance, polymorphism, encapuslation...

public class Library {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("madolduwa", "F. Scott Fitzgerald", 218);
        EBook ebook = new EBook("1984", "George Orwell",  "PDF");
        AudioBook audiobook = new AudioBook("To Kill a Mockingbird", "Harper Lee",  12.5);

        System.out.println(printedBook.getInfo());
        System.out.println(ebook.getInfo());
        System.out.println(audiobook.getInfo());
    }
}

class Book{
    private String title;
    private String author;
    
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String getInfo(){
        return title + " by " + author + " ";
    }
}

class EBook extends Book{
    private String fileFormat;

    public EBook(String title,String author,String fileFormat) {
        super(title, author);
        this.fileFormat = fileFormat;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Format: " + fileFormat;
    }
}

class AudioBook extends Book {
    private double duration;

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Duration: " + duration + " hours";
    }
}

class PrintedBook extends Book{
    private int pages;

    public PrintedBook(String title, String author,int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + pages + " pages";
    }
}