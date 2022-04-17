package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		// Arrays: DataType [] Variable = new DataType[array size]; 
		int [] values = new int[100];
		// All arrays start at zero and end at the (size - 1)
		values[0] = 1;
		values[99] = 100;
		// values[10] = "text"; <-- this would get us an error, because all the variables must be the DataType defined.
		
		// System.out.println(values[100]); <-- this would be out of bounds / out of range
		System.out.println(values[0]);
		System.out.println(values[49]); // any array position that hasn't been defined is 0 (for integers)
		System.out.println(values[99]);
		
		// String arrays
		String [] words = new String[] {"Hello,", "my", "name", "is"};
		System.out.println(words[3]);
		
		// or
		String [] sentence = new String[4];
		sentence[0] = "Hello,";
		sentence[1] = "my";
		sentence[2] = "name";
		System.out.println(sentence[3]); // any array position that hasn't been defined is null (for strings)
		
		// You can redeclare the variable with a new array but the current data will reset
		sentence = new String[100];
		System.out.println(sentence[0]);
	}

}
