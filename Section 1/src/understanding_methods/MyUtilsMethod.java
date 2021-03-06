package understanding_methods;

// importing classes from different packages:
// import PackageName.ClassName;
import java_basics.ControlFlow;

public class MyUtilsMethod {

	public static void main(String[] args) {
		Example();
	}
	
	public static void printSomeJunk() { // this is a basic function
		System.out.println("basic funtion");
		ControlFlow.doSomething(0);
	}
	
	public static void printSomeString(String word) { // this is a function
		System.out.println(word);
	}
	
	
	public static void printSomeInt(int x) {
		System.out.println(x);
	}
	
	
	public static void printStuff(String x) {
		System.out.println("This is a string x: " + x);
	}
											
	// The function is named the exact same, and which ever the DataType matches, it will be called.
	
	public static void printStuff(int x) {
		System.out.println("This is an integer x: " + x);
	}
	
	
	public static void addition(double x, double y) {
		System.out.println(x+y);
	}
	
	// void is not allowed to return anything
	// when you want to return you should replace void with a valid DataType.
	public static int addten(int x) {
		int result = x + 10;
		x += 10;
		return result;
	}
	
	// private classes can only be used locally and nowhere else. 
	private static void Example() {
		System.out.println("This class can ONLY be used locally! because it is private");
	}
	
}
