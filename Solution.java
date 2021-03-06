/* 2017/03/20
 * Package Solution For Nulogy
 * Copyright Xueqian Zhou 
 * Version 1.3
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Solution {
	/*
	 * 
	 * Flat MarkUp 5%
	 * HeadFee   1.2%
	 * Drug      7.5%
	 * Food       13%
	 * Electronic  2%
	 * Else        0
	 */	
    // Initial markup %
    private static double Flatfee = 1.05;
    private static double Labourfee = 0.012;
    private static double Drugfee = 0.075;
    private static double Foodfee = 0.13;
    private static double Electronicsfee = 0.02;
	
    public static double Flatrate;
    public static double price;
    public static double numofpeople;
    public static String ProductType;
    // get flat markup
    public static double getFlatrate(double price) {
    	Flatrate = price * Flatfee;
    	return Flatrate;
	}
    // get  # of people
    public static int getNumberofpeople(double numofpeople) {
    	return (int) numofpeople;
    }
    // Calculate final payment according to category
    public static double getProdcutType(String ProductType) {
	   if (ProductType != "drugs" && ProductType != "food" && ProductType != "electronics") {
		   ProductType = "else";
	   }
	   double payment = 0;
       switch(ProductType.toLowerCase()) {
           case "drugs":
        	   payment = getFlatrate(price) * (1 + getNumberofpeople(numofpeople) * Labourfee + Drugfee);
        	   break;
           case "food":
        	   payment = getFlatrate(price) * (1 + getNumberofpeople(numofpeople) * Labourfee + Foodfee);
        	   break;
           case "electronics":
        	   payment = getFlatrate(price) * (1 + getNumberofpeople(numofpeople) * Labourfee + Electronicsfee);
        	   break;   
           case "else":
        	   payment = getFlatrate(price) * (1 + getNumberofpeople(numofpeople) * Labourfee);
        	   break;
       }     
	return payment;
   }
	
    // Change Test Case Here
    public static void setParameters() {
    	price = 12456.95;   // set price of product
    	numofpeople = 4;    // set # of People
    	ProductType = "books";  //Set category
    }
    
	public static void main(String[] args) {
		setParameters();  //read product information		
		NumberFormat output = new DecimalFormat("$###,###,###.##");  // set Format
		String Price = output.format(price);
		String Payment = output.format(getProdcutType(ProductType));
		System.out.println("Input: " + Price +", " + getNumberofpeople(numofpeople) + " people, " + ProductType);
		System.out.println("Output: " + Payment);
	}
	
}
