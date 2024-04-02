package com.springframwork.BasicCalculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.springframwork.BasicCalculator.calculator.BusinessCalculationService;
import com.springframwork.BasicCalculator.calculator.DataSerice;
import com.springframwork.BasicCalculator.calculator.MegoDbDataService;

@Configuration
@ComponentScan("com.springframwork.BasicCalculator.calculator")
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CalculatorMain.class);
      System.out.println(context.getBean(BusinessCalculationService.class).findMax());
	}

}
