package work.yeshu.readbook.domain.repository;

import java.util.List;

import work.yeshu.readbook.domain.model.Book;

/**
 * Created by yeshu on 2017/9/6.
 */

public interface BookRepository {

    int addBook(String name, String desc, String picture);

    Book getBookById(long id);

    List<Book> getBooks();

    boolean deleteBookById(long id);
}
