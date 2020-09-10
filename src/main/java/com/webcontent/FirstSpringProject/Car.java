package com.webcontent.FirstSpringProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("It's running...");
	}
}
