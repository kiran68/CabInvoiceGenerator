package com.bridgelabz.cabinvoicegenerator;

public class InvoiceGenerator {
private static final int COST_PER_TIME = 1;
private static final double MINIMUM_COST_PER_TIME = 10;

public double calculateFare(double distance,int time) {
	return distance * MINIMUM_COST_PER_TIME + time * COST_PER_TIME;
}
}
