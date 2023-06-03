package com.example.th_t2_btvn.Controller;

import com.example.th_t2_btvn.Service.BookService;
import com.example.th_t2_btvn.Service.CategoryService;
import com.example.th_t2_btvn.entity.Book;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/books"})
public class BookController {
//    @Autowired
//    private List<Book> books;
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;
    public BookController() {
    }

    @GetMapping
    public String showAllBook(Model model) {
        List<Book> listBook = bookService.getAll();
        model.addAttribute("books", listBook);
        return "book/list";
    }
//    @GetMapping
//    public String ListBooks(Model model) {
//        model.addAttribute("books", this.books);
//        model.addAttribute("title", "Book List");
//        return "book/list";
//    }
//
    @GetMapping({"/add"})
    public String AddForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("categories", categoryService.listAll());
        return "book/add";
    }

    @PostMapping({"/add"})
    public String AddBook(@Valid @ModelAttribute("book") Book book, BindingResult  bindingResult, Model model) {
        // validator
        if (bindingResult.hasErrors()){
            model.addAttribute("categories", categoryService.getAllCategories());
            return "book/add";
        }

        this.bookService.save(book);
        return "redirect:/books";
    }
//
    @GetMapping({"/edit/{id}"})
    public String EditForm(@PathVariable("id") Long id, Model model) {
        Book book = bookService.get(id);
        if (book != null) {
            model.addAttribute("categories", categoryService.getAllCategories());
            model.addAttribute("book", book);
            return "book/edit";
        } else {
            return "not found";
        }
    }
//
    @PostMapping({"/edit"})
    public String EditBook(@ModelAttribute("book") Book updatedBook) {
        if (updatedBook != null ) {
            this.bookService.save(updatedBook);
            return "redirect:/books";
        } else {
            return "not found";
        }

    }
//
    @GetMapping({"/delete/{id}"})
    public String DeleteBook(@PathVariable("id") Long id) {
        this.bookService.delete(id);
        return "redirect:/books";
    }
}
