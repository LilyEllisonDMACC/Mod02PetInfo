/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Sep 1, 2023
 */
package model;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Sep 1, 2023
 */
public class PetInfo {
	private String species;
	private String name;
	private String sex;
	private boolean altered;
	private int age;
	
	public PetInfo() {
		
	}
	
	public PetInfo(String sp, String n, String sx, boolean alt) {
		setSpecies(sp);
		setName(n);
		setSex(sx);
		setAltered(alt);
	}
	
	public PetInfo(String sp, String sx, boolean alt, int age) {
		setSpecies(sp);
		setSex(sx);
		setAltered(alt);
		setAge(age);
	}
	
	public String petSpeak() {
		String petSpecies = getSpecies();
		String petSays = "Hello";
		if (petSpecies == "Canine") {
			petSays = "WOOF!";
		} else if (petSpecies == "Feline") {
			petSays = "MEOW!";
		}
		return petSays;
	}
	
	public String praisePet() {
		String petGender = getSex();
		String petPraise = "Good ";
		if(petGender == "Female") {
			petPraise += "girl!";
		} else if(petGender == "Male") {
			petPraise += "boy!";
		} else {
			petPraise += "pet!";
		}
		return petPraise;
		
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the altered
	 */
	public boolean isAltered() {
		return altered;
	}

	/**
	 * @param altered the altered to set
	 */
	public void setAltered(boolean altered) {
		this.altered = altered;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
