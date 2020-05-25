package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	// static double taxRate = 0.05;
	public static double taxRate;

	static {
		taxRate = 0.05;
	}

	public Order(MyDate d, double amt, String c, String p, int q) {
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = p;
		quantity = q;
	}

	public String toString() {
		return quantity + " ea. " + product + " for " + customer;
	}

	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	public char jobSize() {
		// ... add your code here to compute and
		// return the job size for an order
		if (quantity <= 25) {
			return 'S';
		} else if (quantity > 25 && quantity <= 75) {
			return 'M';
		} else if (quantity > 75 && quantity <= 150) {
			return 'L';
		}
		return 'X';
	}
	
	public double computeTotal() {
		double total = orderAmount;
		switch(jobSize()) {
		case 'M':
			total -= orderAmount * 0.01;
			break;
		case 'L':
			total -= orderAmount * 0.02;
			break;
		case 'X':
			total -= orderAmount * 0.03;
			break;
		}
		if(total <= 1500) {
			total += computeTax();
		}
		return total;
		
	}
}
