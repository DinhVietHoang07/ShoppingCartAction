package com.example.model;

import com.example.entity.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryModelTest {

    private MySqlCategoryModel model;
    @BeforeEach
    void setUp() {
        model = new MySqlCategoryModel();
    }
    @Test
    public void create(){
        Category category = new Category();
        category.setName("Bò tông nhau");
        model.save(category);
        Category category2 = new Category();
        category2.setName("Bò húc");
        model.save(category2);
        assertEquals(2,model.findAll().size());
    }
}