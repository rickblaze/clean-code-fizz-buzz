package com.clean.code.input;

public class InputNumber {
	
	private int value;
	
	public InputNumber(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isDivisibleBy3(){
		return value % 3 == 0;
	}
	
	public boolean isDivisibleBy5(){
		return value % 5 == 0;
	}
}