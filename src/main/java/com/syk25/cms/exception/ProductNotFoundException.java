package com.syk25.cms.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
