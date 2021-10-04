package com.dio.product.repository;

import com.dio.product.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Integer> {
}
