package understanding_object_orientation.Zoo;

public class Animal { // parent class / super class / base class
	
	String species;
	int age;
	double size; 
	double weight;
	String color;
	String food;
	
	public Animal(String species, int age, double size, double weight, String color, String food) {
		super();
		this.species = species;
		this.age = age;
		this.size = size;
		this.weight = weight;
		this.color = color;
		this.food = food;
	}
	
	public void Eat() {
		System.out.println("The "+ species +" is eating "+food+". Let's leave him alone.");
	}

	public void Sleep() {
		System.out.println("The "+ species + " is sound asleep let's not disturb him.");
	}
	
	public void Play() {
		System.out.println("Oh look! the " + species + " is playing, lets go watch.");
	}
	
}

