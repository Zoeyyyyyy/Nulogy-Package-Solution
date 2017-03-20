package org.java.demo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FirstTrial {

	/*
	 * 
	 * Flat MarkUp 5%
	 * HeadFee   1.2%
	 * Drug      7.5%
	 * Food       13%
	 * Electronic  2%
	 * Else        0
	 */
	//Pr
	static Double input = 1299.99;		
	//Flat Markup
	public static double flat() {
		return input = input *1.05;
	}
	//Labour
	public static double Labour(Integer cts) {
		return input = input*(1+0.012*cts);
	}
	//Drugs
	public static double Drugs(Boolean flag) {
		double DrugsMarkup=0.075;
		if(flag) {
			input = input*(1+DrugsMarkup);
		}else {
			input = input;
		}
		return input;
	}
	//Food
	public static double Food(Boolean flag) {
		double FoodMarkup = 0.13;
		if(flag){
			input = input*(1+FoodMarkup);
		}else{
			input = input;
		}
		return input;
	}
	//Electronics
	public static double Electronics(Boolean flag){
		double ElectronicsMarkup=0.02;
		if(flag) {
			input = input*(1 + ElectronicsMarkup);
		}else{
			input = input;
		}
		return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf=new DecimalFormat("$##,###.##");
		String str=nf.format(flat());
		System.out.println("Flat Cost: "+str);
		
		str=nf.format(Labour(3));
		System.out.println("Labour Cost:"+str);
		
		//Drugs
		str=nf.format(Drugs(false));
		System.out.println("Output:"+str);
		//Food
		str=nf.format(Food(false));
		System.out.println("Output:"+str);
		//Electronics
		str=nf.format(Electronics(true));
		System.out.println("Output:"+str);
		
	}

}
