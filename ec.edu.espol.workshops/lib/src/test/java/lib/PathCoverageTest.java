package lib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ec.edu.espol.workshops.CarInsurance;

public class PathCoverageTest {
	CarInsurance seguro = new CarInsurance();

	// Test to check PC-TC01
	@Test
	public void testCalculatePremiumOne() {
		seguro.setAge(40);
		seguro.setGender('F');
		seguro.setMarried(true);

		int valSeg = seguro.calculatePremium(false);
		assertEquals(-1, valSeg);
	}

	// Test to check PC-TC02
	@Test
	public void testCalculatePremiumTwo() {
		seguro.setAge(20);
		seguro.setGender('M');
		seguro.setMarried(false);

		int valSeg = seguro.calculatePremium(true);
		assertEquals(2000, valSeg);
	}

	// Test to check PC-TC03
	@Test
	public void testCalculatePremiumThree() {
		seguro.setAge(50);
		seguro.setGender('F');
		seguro.setMarried(true);

		int valSeg = seguro.calculatePremium(true);
		assertEquals(200, valSeg);
	}

	// Test to check PC-TC04
	@Test
	public void testCalculatePremiumFour() {
		seguro.setAge(60);
		seguro.setGender('M');
		seguro.setMarried(false);

		int valSeg = seguro.calculatePremium(true);
		assertEquals(400, valSeg);
	}

	// Test to check PC-TC05
	@Test
	public void testCalculatePremiumFive() {
		seguro.setAge(30);
		seguro.setGender('M');
		seguro.setMarried(false);

		int valSeg = seguro.calculatePremium(true);
		assertEquals(500, valSeg);
	}

}
