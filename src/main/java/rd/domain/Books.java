package rd.domain;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Books {

    private ArrayList<Book> books;

    @XmlElement(name = "book")
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
