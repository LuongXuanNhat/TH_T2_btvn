package com.example.th_t2_btvn.Repositories;

import com.example.th_t2_btvn.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IBookRepository extends JpaRepository<Book, Long> {
}
