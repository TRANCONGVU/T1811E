package com.example.demo001.model;

import com.example.demo001.entity.product;
import org.springframework.data.repository.CrudRepository;

public interface ProductModel extends CrudRepository<product,Integer> {

}
