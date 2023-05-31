package com.example.th_t2_btvn.Service;

import com.example.th_t2_btvn.Repositories.ICategoryRepository;
import com.example.th_t2_btvn.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> listAll() {
        return categoryRepository.findAll();
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category get(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getAllCategories() { return categoryRepository.findAll(); }

    public void delete(long id) {
        categoryRepository.deleteById(id);
    }


}