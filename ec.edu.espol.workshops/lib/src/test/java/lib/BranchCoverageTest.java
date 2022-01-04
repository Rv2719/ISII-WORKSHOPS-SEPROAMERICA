package lib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ec.edu.espol.workshops.CarInsurance;

public class BranchCoverageTest {

	CarInsurance seguro = new CarInsurance();

	// Test to check BC-TC01
	@Test
	public void testCalculatePremiumOne() {
		seguro.setAge(20);
		seguro.setGender('F');
		seguro.setMarried(false);

		int valorSeguro = seguro.calculatePremium(false);
		assertEquals(-1, valorSeguro);
	}

	// Test to check BC-TC02
	@Test
	public void testCalculatePremiumTwo() {
		seguro.setAge(32);
		seguro.setGender('F');
		seguro.setMarried(false);

		int valorSeguro = seguro.calculatePremium(true);
		assertEquals(500, valorSeguro);
	}

	// Test to check BC-TC03
	@Test
	public void testCalculatePremiumThree() {
		seguro.setAge(23);
		seguro.setGender('M');
		seguro.setMarried(false);

		int valorSeguro = seguro.calculatePremium(true);
		assertEquals(2000, valorSeguro);
	}

	// Test to check BC-TC04
	@Test
	public void testCalculatePremiumFour() {
		seguro.setAge(44);
		seguro.setGender('F');
		seguro.setMarried(true);

		int valorSeguro = seguro.calculatePremium(true);
		assertEquals(300, valorSeguro);
	}

	// Test to check BC-TC05
	@Test
	public void testCalculatePremiumFive() {
		seguro.setAge(50);
		seguro.setGender('F');
		seguro.setMarried(true);

		int valorSeguro = seguro.calculatePremium(true);
		assertEquals(200, valorSeguro);
	}

	// Test to check BC-TC06
	@Test
	public void testCalculatePremiumSix() {
		seguro.setAge(45);
		seguro.setGender('M');
		seguro.setMarried(false);

		int valorSeguro = seguro.calculatePremium(true);
		assertEquals(400, valorSeguro);
	}

}
