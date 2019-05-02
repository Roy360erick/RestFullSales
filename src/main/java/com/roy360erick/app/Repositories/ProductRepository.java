package com.roy360erick.app.Repositories;

import com.roy360erick.app.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Serializable> {

}
