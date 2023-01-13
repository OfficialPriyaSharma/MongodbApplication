package com.example.Service;

import com.example.Entity.Product;
import com.example.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getAllProductDetailById(int id){
        return productRepository.findById(id).get();
    }

    public String deleteProductById(int productId){
        if(productRepository.findById(productId).isEmpty()){
            return "Product does not exist";
        }
        productRepository.deleteById(productId);
        return "product deleted successfully";
    }



}
