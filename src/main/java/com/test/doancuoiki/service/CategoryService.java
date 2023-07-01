package com.test.doancuoiki.service;

import com.test.doancuoiki.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    List<Category> findAll();
}
