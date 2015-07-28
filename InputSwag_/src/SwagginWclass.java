import java.util.Scanner;
public class SwagginWclass {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		String input;
		
		System.out.println("Hello Player! What is your name?");
		input = myscanner.nextLine();
		System.out.println("Welcome to my family, " + input + " (Puts hand on shoulder)");
		
		System.out.println("How old are you friend?");
		double age = myscanner.nextDouble();
		System.out.println(age + " is a very good age. :D");
		
		if(age >= 18){ // <-- Boolean expression
			System.out.println("You can see whatever movie you want");
		}else if(age >= 15 && age < 18){
			System.out.println("You can watch up to PG-13! ");
		}else{
			System.out.println("You can't see whatever movie you want :(");
		}
		
		System.out.println("Y");
		
		// Boolean expression
		// > 
		// < 
		// ==
		// <=
		// >=
		// !=
		
		// Combinations
		// &&
		// || <-- above enter key, press shift
		// 
		

	}

}
