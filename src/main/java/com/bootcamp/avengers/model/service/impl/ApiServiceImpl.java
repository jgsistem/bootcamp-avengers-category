package com.bootcamp.avengers.model.service.impl;

import com.bootcamp.avengers.model.entity.Category;
import com.bootcamp.avengers.model.repository.CategoryRepository;
import com.bootcamp.avengers.model.service.IApiService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ApiServiceImpl implements IApiService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Observable<List<Category>> getAllCategories() {
        return Observable.fromArray(categoryRepository.findAll());
    }

    @Override
    public Completable saveCategory(Category category) {
        return Completable.create(subscriber -> {
            categoryRepository.save(category);
            subscriber.onComplete();
        });
    }

    @Override
    public Observable<List<Category>> getAllCategoriesByDiscount(Long idDiscount) {
        return Observable.fromArray(categoryRepository.findAll());
    }
}
