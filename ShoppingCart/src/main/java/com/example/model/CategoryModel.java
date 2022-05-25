package com.example.model;

import com.example.entity.Category;

import java.util.List;

public interface CategoryModel {
    Category save(Category obj);
    List<Category> findAll();
    Category finById(int id);

    Category findById(int id);

    Category update(int id, Category updateObj);
    boolean delete(int id);
}
