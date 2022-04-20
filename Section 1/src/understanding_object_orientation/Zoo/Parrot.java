package understanding_object_orientation.Zoo;


// classes can only extend ONE class!
// but classes can have multiple interfaces!
public class Parrot extends Birds implements Flyable{

	public Parrot(String species, int age, double size, double weight, String color, String food) {
		super(species, age, size, weight, color, food);
		
	}

	public void fly() {
		System.out.println("Oh look! That is a flying parrot.");
	}
	
	

}
