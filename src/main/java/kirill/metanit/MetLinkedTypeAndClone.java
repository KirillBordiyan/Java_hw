package kirill.metanit;


public class MetLinkedTypeAndClone {
    public static void main(String[] args) {
        try {
            Book2 book = new Book2("War and Peace", "Leo Tolstoy");
            Book2 book2 = book.clone();
            //так как класс книги имеет встроенный класс автора и использует его, то мы не можем клонировать объект без
            //последствий, для этого оба класса должны иметь метод клонирования данных
            book2.setAuthor("Ivan Turgenev");
            System.out.printf("%s (%s)\n",book.getAuthor(), book.getBookName());
            book2.setBookName("Dad's and children");
            System.out.printf("%s (%s)\n",book2.getAuthor(), book2.getBookName());
        }catch (CloneNotSupportedException ex){
            System.out.println("Cloneable not implemented");
        }
    }
}

class Book2 implements Cloneable{
    private String bookName;
    private Author bookAuthor;

    Book2(String bookName, String bookAuthor){
        super();
        this.bookName = bookName;
        this.bookAuthor = new Author(bookAuthor);
    }

    public void setBookName(String name){bookName=name;}
    public String getBookName(){return bookName;}


    public void setAuthor(String authorName){bookAuthor.setAuthorName(authorName);}
    public String getAuthor(){return bookAuthor.getAuthorName();}

    public String toPrint(){
        return "Книга " + bookName + " (автор " +  bookAuthor+")";
    }

    public Book2 clone() throws CloneNotSupportedException{
        Book2 newBook = (Book2) super.clone();
        newBook.bookAuthor = bookAuthor.clone();
        return newBook;
    }
}

class Author implements Cloneable{
    private String authorName;

    Author(String authorName){this.authorName = authorName;}
    void setAuthorName(String name){authorName = name;}
    String getAuthorName(){return authorName;}

    public Author clone() throws CloneNotSupportedException{
        return (Author) super.clone();
    }
}
