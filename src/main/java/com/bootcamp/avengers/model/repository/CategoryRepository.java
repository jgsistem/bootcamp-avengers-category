package com.bootcamp.avengers.model.repository;

import com.bootcamp.avengers.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select a from Category a where a.idDiscount = ?1")
    List<Category> findAllByDiscount(Long idDiscount);
}
