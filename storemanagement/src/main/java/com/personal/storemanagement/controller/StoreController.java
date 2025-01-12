package com.personal.storemanagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.storemanagement.model.Store;
import com.personal.storemanagement.repo.StoreRepo;

@RestController
public class StoreController {
    
    @Autowired
    private StoreRepo storeRepo;

    @GetMapping("/getStores")
    public Iterable<Store> getStores(){
        return storeRepo.findAll();
    }

    @PostMapping("/addStore")
    public ResponseEntity<Store> addStore(Store store){
        storeRepo.save(store);
        return ResponseEntity.status(HttpStatus.CREATED).body(store);
    }

}
