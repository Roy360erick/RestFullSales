package com.roy360erick.app.Services;

import com.roy360erick.app.Models.Product;
import com.roy360erick.app.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        try {
            return productRepository.findAll();
        }catch (Exception ex){
            return null;
        }
    }
}
