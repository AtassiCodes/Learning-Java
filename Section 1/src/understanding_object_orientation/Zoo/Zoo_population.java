package understanding_object_orientation.Zoo;

public class Zoo_population {
	
	public static void main(String[] args) {
		Animal tiger = new Animal("Tiger", 5, 8.7, 43.5, "Yellow", "Deer");
		Animal monkey = new Animal("Monkey", 3, 5.1, 28.5, "Brown", "Bananas");
		Animal sloth = new Animal("Sloth", 15, 2.9, 35.6, "Beige", "Apples");
		
		
		tiger.Eat();
		sloth.Sleep();
		monkey.Play();
		
		Birds parrot = new Birds("parrot", 3, 1, 15, "green", "worms");
		
		parrot.flying();
	}
	
}
