package com.springframwork.BasicCalculator.calculator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MegoDbDataService implements DataSerice {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {1,9,45,0};
	}

}
