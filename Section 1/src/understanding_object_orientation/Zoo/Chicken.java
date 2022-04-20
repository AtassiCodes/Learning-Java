package understanding_object_orientation.Zoo;

public class Chicken extends Birds {

	public Chicken(String species, int age, double size, double weight, String color, String food) {
		super(species, age, size, weight, color, food);
		
	}
	
	// this is called Method Overriding, used when you don't need a method which is inherited 
//	public void flying() {
//		System.out.println("Chickens can't fly :(");
		// or we can use interface / abstract methods
	}