package getting_started;

public class ControlFlow {

	public static void main(String[] args) {
		// if statement
		
		boolean hungry = true;
		// when a boolean value is not being compared (==) it will automatically check if its true
		// you can use '!' for a NOT statement (just the opposite)
		if(hungry) {
			System.out.println("My stomach is growling.");
		}else {
			System.out.println("I'm stuffed.");
		}
		
		
		int hungerRating = 5;
		if(!(hungerRating<6)) {
			System.out.println("Not hungry");
		}else {
			System.out.println("I'm starving");
		}
		
		
		int favoriteTemp = 25;
		int currentTemp = 10;
		String opinion;
		
		if(favoriteTemp == currentTemp) {
			opinion = "The weather is perfect!";
			if(currentTemp<favoriteTemp - 25) {
				opinion = "I really need my jacket!";
			}else if(currentTemp<favoriteTemp - 10){
				opinion = "Long sleeve shirt should be enough.";
			}else if (currentTemp> favoriteTemp+10) {
				opinion = "I should get some water with me.";
			}else {
				opinion = "It's nice outside.";
			}
		}else {
			opinion = "I'm not sure...";
		}
		System.out.println(opinion);
		
		
		       
		// switch statement
		
		int month = 3;
		String monthString;
		
		// switch(MainVariable) {
				// case CHECK: Variable = OtherVariable
					// if MainVariable == CHECK, then Variable = OtherVariable 
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown Month"; // default is if none of the cases are true. 
		}
		
		System.out.println(monthString);
		
		// typically if you have many options it is better to use Switch statement, rather than If statement. But functionally they are very similar.
	}
}
