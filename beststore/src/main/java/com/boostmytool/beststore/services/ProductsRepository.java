package com.boostmytool.beststore.services;

import com.boostmytool.beststore.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
