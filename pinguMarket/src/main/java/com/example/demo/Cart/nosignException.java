package com.example.demo.Cart;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "객체 없음")
public class nosignException extends Exception {
	public nosignException(String msg) {
		super(msg);
	}

}