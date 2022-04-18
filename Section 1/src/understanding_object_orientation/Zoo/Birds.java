package understanding_object_orientation.Zoo;

public class Birds {
	
	String species;
	int age;
	String color;
	
	public Birds(String species, int age, String color) {
		super();
		this.species = species;
		this.age = age;
		this.color = color;
	}

	public void flying() {
		System.out.println("Wow! That is a beutiful " + color + " " + species + " bird flying.");
	}
		
}
