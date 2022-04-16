package getting_started;

public class VariablesContinued {

	public static void main(String[] args) {
		// primitive data types
		
		// int only supports data (numbers) up to 2^32
		int x = 999999999;
		
		// long  *takes up more capacity* as it is expected to store much larger numbers, even if it is not storing the maximum it can
		long y = 999999999999999999L;

		// short takes less memory and has a maximum of 32767
		short z = 32767;
		
		// byte is best used for any variable less than 100, takes the least amount of memory, max is 127
		byte w = 127;
		
		// for decimals you can only use double
		double decimal = 3.17;
		
		// boolean is only true / false
		boolean decision = false;
		
		// char is used for only single characters (any characters), and you must use single quotes for those
		char letter = 'a';
		
	}

}
