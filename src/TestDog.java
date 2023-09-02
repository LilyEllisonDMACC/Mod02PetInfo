/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Sep 1, 2023
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.PetInfo;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Sep 1, 2023
 */
public class TestDog {

	String species = "Canine";
	String sex = "Male";
	boolean altered = false;
	int age = 4;
	
	PetInfo petInfo = new PetInfo(species, sex, altered, age);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAgeNotNull() {
		assertNotNull(petInfo.getAge());
	}
	
	@Test
	public void testNameNull() {
		assertNull(petInfo.getName());
	}
	
	@Test
	public void testIsAlteredFalse() {
		assertFalse(petInfo.isAltered());
	}
	
	@Test
	public void testPetSpeaks() {
		String dogSays = "WOOF!";
		assertEquals(petInfo.petSpeak(), dogSays);
	}
	
	@Test
	public void testPraisePet() {
		String petPraise = "Good boy!";
		assertEquals(petInfo.praisePet(), petPraise);
	}

}
