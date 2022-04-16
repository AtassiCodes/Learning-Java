package getting_started;

public class Variables {

	public static void main(String[] args) {
		System.out.println("Integers (int): ");
		// variables MUST start with a letter, and can only contain letters & numbers.
		
		// DataType Variable = Value;
		int x = 1;
		System.out.println(x);
		
		// or you can do the following:
		int y;
		y = 10;
		System.out.println(y);
		
		// or:
		int z = 100;
		System.out.println(z);

		// changing data, no mention of data type, as it has already been declared:
		z = 5;

		// int z = 1; <-- This would be a duplication of variable and would cause an error.
		System.out.println(z);
		
		// you can add operators in the System.out.println
		System.out.println(z + 4);
		System.out.println(z - 4);
		System.out.println(z * 4);
		System.out.println(z / 4);
		System.out.println(z % 9);
		System.out.println(z ^ 9);
		
		// -----
		System.out.println(" ");
		System.out.println("Strings: ");		
		
		String words;
		words = "Only things with double quotes can define a string";
		System.out.println(words);
		
		String text = "Hello there.";
		System.out.println(text);
		
		// you can *append* strings in the System.out.println
		System.out.println(words + " " + text);
		
		// you can add a string and an integer to print
		System.out.println("This is var z: " + z + ", " + words);
	} 

}