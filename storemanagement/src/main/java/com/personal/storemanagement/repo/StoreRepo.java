package com.personal.storemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.storemanagement.model.Store;

public interface StoreRepo extends JpaRepository<Store, Long> {
    
}
