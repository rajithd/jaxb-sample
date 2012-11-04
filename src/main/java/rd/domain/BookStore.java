package rd.domain;

import rd.adapter.BookAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;


@XmlRootElement(name = "bookStore")
public class BookStore {

    private HashMap<String,Book> books;

    @XmlElement
    @XmlJavaTypeAdapter(BookAdapter.class)
    public HashMap<String, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Book> books) {
        this.books = books;
    }
}
