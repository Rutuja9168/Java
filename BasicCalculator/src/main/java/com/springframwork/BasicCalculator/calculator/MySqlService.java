package com.springframwork.BasicCalculator.calculator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlService implements DataSerice {

	@Override
	
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new  int[] {20,7,89,40};
	}

}
