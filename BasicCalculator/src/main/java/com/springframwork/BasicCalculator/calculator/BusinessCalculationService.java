package com.springframwork.BasicCalculator.calculator;

import java.util.Arrays;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@ComponentScan
@Component
public class BusinessCalculationService {
	private DataSerice dataSerice;
	public BusinessCalculationService(DataSerice dataSerice) {
		this.dataSerice=dataSerice;
		
	}

	
	public int findMax() {
		
		return Arrays.stream(dataSerice.retriveData()).max().orElse(0);
	}
	

}
