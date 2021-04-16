package com.bootcamp.avengers.controllers;

import com.bootcamp.avengers.model.entity.Category;
import com.bootcamp.avengers.model.service.IApiService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category/v1")
public class ApiController {
    @Autowired
    private IApiService apiService;

    @GetMapping("/")
    public String index() {
        return "bootcamp-avengers-category-details api rest";
    }

    @GetMapping("/all")
    public Observable<List<Category>> getAllCategories() {
        return apiService.getAllCategories()
                .subscribeOn(Schedulers.io());
    }

    @PostMapping("/save")
    public Completable saveCategory(@RequestBody Category category) {
        return apiService.saveCategory(category)
                .subscribeOn(Schedulers.io());
    }

    @GetMapping("/allByDiscount/{idDiscount}")
    public Observable<List<Category>> getAllCategoriesByDiscount(@PathVariable Long idDiscount) {
        return apiService.getAllCategoriesByDiscount(idDiscount)
                .subscribeOn(Schedulers.io());
    }
}