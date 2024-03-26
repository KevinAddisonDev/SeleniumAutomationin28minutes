package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest; 
	
	public SimpleInterestCalculator(String principal, String interest) {
		// we keep strings for this method as the BigDecimal function in java will only convert string values accurately
		
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {//when auto generated the return type of bigdecimal is taken from the code stub
		//we cannot add or multiply bigDecimals directly we need to convert like number1.add(nuber2);
		BigDecimal noOfYearsbBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest).multiply(noOfYearsbBigDecimal));
		return totalValue;
	}
	
	//create a simple interest calculator that will output the following simple interest formula
	//Total Amount = principal+principal*interest*noOfYears

}
