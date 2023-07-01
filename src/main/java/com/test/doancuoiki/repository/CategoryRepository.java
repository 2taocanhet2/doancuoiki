package com.test.doancuoiki.repository;

import com.test.doancuoiki.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category , Long> {
    Category findByCategoryName(String name);
}
