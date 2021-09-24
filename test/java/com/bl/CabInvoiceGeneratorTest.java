package com.bl;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator = null;

	@Before
	public void setup() throws Exception {
		cabInvoiceGenerator = new CabInvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnMaxFare() {
		double result = cabInvoiceGenerator.calculateFare(2.0, 5);
		Assert.assertEquals(25, result, 0.0);
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		double result = cabInvoiceGenerator.calculateFare(0.1, 1);
		Assert.assertEquals(5, result, 0.0);

	}

	@Test
	public void givenMultipleDistanceAndTime_ShouldReturnInvoiceSummary() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		InnoiceSummary summary = cabInvoiceGenerator.calculateFare(rides);
		InnoiceSummary expectedInnoiceSummary = new InnoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInnoiceSummary, summary);
	}
}
