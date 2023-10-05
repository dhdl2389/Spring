package com.acorn.web;

public class Fighting {
String message;

public Fighting() {
	// TODO Auto-generated constructor stub
}

public Fighting(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return "Fighting [message=" + message + "]";
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}



}
