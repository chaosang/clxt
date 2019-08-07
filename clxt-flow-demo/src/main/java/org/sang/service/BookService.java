package org.sang.service;

import org.sang.dao.BookDao;
import org.sang.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sang on 2018/7/15.
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    public void addBook(Book book) {
        bookDao.save(book);
    }
    public Page<Book> getBookByPage(Pageable pageable) {
        return bookDao.findAll(pageable);
    }

    public List<Book> getBooksByIdGreaterThan(double id){
        return bookDao.getBooksByIdGreaterThan(id);
    }
    public Book getMaxIdBook(){
        return bookDao.getMaxIdBook();
    }

}