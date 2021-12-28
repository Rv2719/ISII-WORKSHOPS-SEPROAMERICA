package lib;

import ec.edu.espol.workshops.CarInsurance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
	CarInsurance seguro=new CarInsurance();
	
	//test to check Test-01
	@Test
	public void testCalculatePremiumOne() {		
		seguro.setAge(50);
		seguro.setGender('M');
		seguro.setMarried(true);
		
		int valSeguro =seguro.calculatePremium(false);
		assertEquals(-1, valSeguro, 0.0);
	}
	
	//test to check Test-02
	@Test
	public void testCalculatePremiumTwo() {		
		seguro.setAge(24);
		seguro.setGender('M');
		seguro.setMarried(false);
		
		int valSeguro =seguro.calculatePremium(true);
		assertEquals(2000 , valSeguro, 0.0);
	}
	
	//test to check Test-03
	@Test
	public void testCalculatePremiumThree() {		
		seguro.setAge(24);
		seguro.setGender('M');
		seguro.setMarried(true);
		
		int valSeguro =seguro.calculatePremium(true);
		assertEquals(300 , valSeguro, 0.0);
	}
	
	//test to check Test-04
	@Test
	public void testCalculatePremiumFour() {		
		seguro.setAge(50);
		seguro.setGender('M');
		seguro.setMarried(false);
		
		int valSeguro =seguro.calculatePremium(true);
		assertEquals(400 , valSeguro, 0.0);
	}

}
