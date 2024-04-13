package com.springframwork.LasyInitiation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@Lazy
public class ClassB {
	private ClassA classA;
	
 public ClassB (ClassA classA) {
		System.out.println("this is constructor");

	this.classA=classA; 
 }
 public void run() {
	System.out.println("this is run methode");
 }
}
