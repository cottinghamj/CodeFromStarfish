package FruitLoops;

import java.util.Scanner;

public class MethodReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String save = name("Starfish");
		System.out.println(save);
		
		forloop();

	}

	public static String name(String name){
		return "Your name is "+ name;
	}
	
	public static void forloop(){
		Scanner scnr = new Scanner(System.in);
		int choice;
		int sum = 0;
		for(int index = 0; index < 10 ; index += 1){
			choice = scnr.nextInt();
			sum+= choice;
			System.out.println(choice);
		}
		
		System.out.println("Your total sum was: " + sum);
		
	}
	
}
