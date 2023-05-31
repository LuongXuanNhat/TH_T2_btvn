package com.example.th_t2_btvn;

import com.example.th_t2_btvn.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    public AppConfig() {
    }

    @Bean
    public List<Book> getBooks() {
        List<Book> books = new ArrayList();
//        Book book1 = new Book();
//        book1.setId(1L);
//        book1.setTitle("Lập Trình Web Spring Boot");
//        book1.setAuthor("Lương Xuân Nhất");
//        book1.setPrice(20.00);
//        book1.setCategory("CNTT");
//        books.add(book1);
//        Book book2 = new Book();
//        book2.setId(2L);
//        book2.setTitle("Lập trình Ứng dụng Spring");
//        book2.setAuthor("Lương Xuân Nhất");
//        book2.setPrice(20.00);
//        book2.setCategory("CNTT");
//        books.add(book2);
//        Book book3 = new Book();
//        book3.setId(3L);
//        book3.setTitle("Lập trình Ứng dụng Java");
//        book3.setAuthor("Lương Xuân Nhất");
//        book3.setPrice(20.00);
//        book3.setCategory("CNTT");
//        books.add(book3);
//        Book book4 = new Book();
//        book4.setId(4L);
//        book4.setTitle("Lập trình Web ASP.Net MVC");
//        book4.setAuthor("Lương Xuân Nhất");
//        book4.setPrice(20.00);
//        book4.setCategory("CNTT");
//        books.add(book4);
        return books;
    }
}