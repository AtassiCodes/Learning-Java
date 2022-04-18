package understanding_object_orientation.Humans;


public class Human {
	
	String name;
	int age;
	int height;
	String eyeColor;
	
	// they have the same name as the class & have no return value
	// this is a constructor method
	// anything put in the constructor will be the default values of any Human object
	
	public Human(String name, int age, int height, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}


	// methods or instructions for the Human (class) would behave:
	
	public void speak() {
		System.out.println("Hello! My name is " + name +".");
		System.out.println("I am " + height + "cm tall.");
		System.out.println("I am "+age+" years old");
		System.out.println("My eye color is "+eyeColor+".");
	}

	public void eat() {
		System.out.println(name + " is currently eating...");
	}
	
	public void walk() {
		System.out.println(name + " is walking...");
	}
	
	public void work() {
		System.out.println(name + " is busy working...");
	}
}
