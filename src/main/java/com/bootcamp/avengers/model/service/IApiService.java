package com.bootcamp.avengers.model.service;

import com.bootcamp.avengers.model.entity.Category;
import io.reactivex.Completable;
import io.reactivex.Observable;

import java.util.List;

public interface IApiService {

    Observable<List<Category>> getAllCategories();

    Completable saveCategory(Category category);
    Observable<List<Category>> getAllCategoriesByDiscount(Long idDiscount);
}
