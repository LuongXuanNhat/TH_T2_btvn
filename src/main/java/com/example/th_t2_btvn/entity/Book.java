package com.example.th_t2_btvn.entity;

import com.example.th_t2_btvn.Validator.annotation.ValidCategoryId;
import com.example.th_t2_btvn.Validator.annotation.ValidUserId;
import com.example.th_t2_btvn.Validator.annotation.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Title must not be empty")
    @Size(max = 50, min = 1, message = "Title must be les than 50 character")
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Column(name = "author", nullable = false, length = 255)
    private String author;

    @NotNull(message = "Price is required")
    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;

    public Book() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

}
