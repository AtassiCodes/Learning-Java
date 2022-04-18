package understanding_object_orientation.Zoo;

public class Birds extends Animal{ // sub class, this is inheritance
	
	public Birds(String species, int age, double size, double weight, String color, String food) {
		super(species, age, size, weight, color, food);
	}
	
	public void flying() {
		System.out.println("Wow! That is a beutiful " + color + " " + species + " bird flying.");
	}
		
}
