package com.clean.code;

import java.util.HashMap;
import java.util.Map;

import com.clean.code.input.InputNumber;

public class FizzBuzzNumberGenerator {
	
	private Map<Integer, String> textMap;
	
	public FizzBuzzNumberGenerator(){
		textMap = new HashMap<>();
		textMap.put(3,  "Fizz");
		textMap.put(5,  "Buzz");
		textMap.put(15,  "FizzBuzz");
	}

	public String generateText(InputNumber inputNumber) {
		return getText(inputNumber);
	}

	protected String getText(InputNumber inputNumber) {
		if(inputNumber.isDivisibleBy3() && !inputNumber.isDivisibleBy5()){
			return textMap.get(3);
		}
		if(inputNumber.isDivisibleBy5() && !inputNumber.isDivisibleBy3()){
			return textMap.get(5);
		}
		return textMap.getOrDefault(inputNumber.getValue(), inputNumber.getValueAsString());
	}
}
