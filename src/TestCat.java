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
public class TestCat {
	
	String species = "Feline";
	String name = "Hazel";
	String sex = "Female";
	boolean altered = true;
	
	PetInfo petInfo = new PetInfo(species, name, sex, altered);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSpeciesNotNull() {
		assertNotNull(petInfo.getSpecies());
	}
	
	@Test
	public void testAgeZero() {
		assertEquals(petInfo.getAge(), 0);
	}
	
	@Test
	public void testIsAlteredTrue() {
		assertTrue(petInfo.isAltered());
	}
	
	@Test
	public void testPetSpeaks() {
		String catSays = "MEOW!";
		assertEquals(petInfo.petSpeak(), catSays);
	}
	
	@Test
	public void testPraisePet() {
		String petPraise = "Good girl!";
		assertEquals(petInfo.praisePet(), petPraise);
	}

}
