package rd.boot;


import rd.domain.Book;
import rd.domain.BookStore;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        File file = new File("book-store.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(BookStore.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            BookStore bookStore = (BookStore) unmarshaller.unmarshal(file);
            HashMap<String, Book> bookMap = bookStore.getBooks();
            for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
                System.out.println("Key = " + entry.getKey());
                System.out.println("value = " + entry.getValue().getAuthor() + " " + entry.getValue().getName());
                System.out.println("=========================");
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
