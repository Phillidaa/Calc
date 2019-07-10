package com.tts.Calculator.Service;

import com.tts.Calculator.Model.CalculatorModel;

public class CalculatorService implements ICalculatorService {

	@Override
	public long add(CalculatorModel model) throws Exception {
		long result = 0L;
		try {
			result = model.operator1 + model.operator2;
		} catch (Exception e) {

		}
		return result;
	}

}
