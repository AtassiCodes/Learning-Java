package understanding_object_orientation.Humans;

public class Population {
	
	public static void main(String[] args) {
	
		// this is creating a new object
		
		Human sharif = new Human("Sharif Atassi", 16, 168, "Brown");		
		Human joe = new Human("Joe", 15, 153, "Blue");
		
		sharif.speak();
		joe.speak();
	}	
}
