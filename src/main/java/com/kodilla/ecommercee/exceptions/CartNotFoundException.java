package com.kodilla.ecommercee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Cart doesn't exist")
public class CartNotFoundException extends Exception {

    public CartNotFoundException() {
        super("Cart doesn't exist");
    }
}
