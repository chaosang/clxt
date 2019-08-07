package org.sang.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.sang.model.Book;
import org.sang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by sang on 2018/7/16.
 */
@Controller
@RequestMapping("/zs")
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "SpringBoot Ajax Echarts");

        return "index";
    }

    @RequestMapping( value = "/echart")
    @ResponseBody
    public List<Book> echarts(HttpServletRequest request, HttpServletResponse response){
        return bookService.getBooksByIdGreaterThan(1.12);
    }

}
