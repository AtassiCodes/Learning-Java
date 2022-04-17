package understanding_methods;

public class Learning_Methods {

	public static void main(String[] args) {
		
		// class in other files can be called by CLASSNAME.function();
		
		MyUtilsMethod.printSomeJunk(); // this calls the basic function
		MyUtilsMethod.printSomeString("helloooo"); // this calls the function
		MyUtilsMethod.printSomeInt(5);
		MyUtilsMethod.printStuff("100");
		MyUtilsMethod.printStuff(999);
		MyUtilsMethod.addition(50, 100);
		MyUtilsMethod.addten(190);
	}
	
}