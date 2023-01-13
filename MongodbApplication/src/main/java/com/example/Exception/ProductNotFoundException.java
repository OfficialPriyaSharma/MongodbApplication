package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND,reason = "Product with specified Id is not found. Kindly submit again")
public class ProductNotFoundException extends Exception {


}
