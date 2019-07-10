package com.tts.Calculator.Model;

import javax.persistence.Entity;

@Entity
public class CalculatorModel {

	public int operator1;
	public int operator2;

	public CalculatorModel() {

	}

	public CalculatorModel(int operator1, int operator2) {
		this.operator1 = operator1;
		this.operator2 = operator2;
	}

	public int getOperator1() {
		return operator1;
	}

	public void setOperator1(int operator1) {
		this.operator1 = operator1;
	}

	public int getOperator2() {
		return operator2;
	}

	public void setOperator2(int operator2) {
		this.operator2 = operator2;
	}

	@Override
	public String toString() {
		return "CalculatorModel [operator1=" + operator1 + ", operator2=" + operator2 + "]";
	}

}
