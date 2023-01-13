package com.example.Controller;

import com.example.Entity.Product;
import com.example.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/products")
    public ResponseEntity<?> addProductDetails(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProductDetailsById(@PathVariable int id){
        return new ResponseEntity<>(productService.getAllProductDetailById(id),HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
        return new ResponseEntity<>(productService.deleteProductById(id),HttpStatus.OK);
    }
    
}
