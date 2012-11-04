package rd.adapter;

import rd.domain.Book;
import rd.domain.Books;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;


public class BookAdapter extends XmlAdapter<Books,Map<String,Book>> {

    // we only going to change this method. Because we are only doing un marshaling
    // xml into map
    @Override
    public Map<String, Book> unmarshal(Books v) throws Exception {
        Map<String, Book> map = new HashMap<String, Book>();
        for(Book book : v.getBooks()){
            map.put(book.getBookId(),book);
        }
        return map;
    }

    @Override
    public Books marshal(Map<String, Book> v) throws Exception {
        return null;
    }
}
