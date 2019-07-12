package org.sang.dao;

import org.sang.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sang on 2018/7/15.
 */
public interface BookDao extends JpaRepository<Book,Integer>{
    List<Book> getBooksByIdGreaterThan(double id);
    @Query(value = "select * from ta where id=(select max(id) from t_book)",nativeQuery = true)
    Book getMaxIdBook();
}
