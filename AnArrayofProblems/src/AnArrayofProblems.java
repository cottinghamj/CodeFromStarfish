
public class AnArrayofProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = new int[1000]; // index this array from 0 -> 4
		
		numArray[0] = 10; // Set the first element in the array to 30
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;
		
		
		System.out.println("------------------");
		for(int i = 0; i < numArray.length; i++){
			numArray[i] = i * 10 + 10;
			System.out.println(numArray[i]);
		}
		
		// If you want to define an array specifically, you can use {}
		
		int[] arr = {1,2,3,4,5};
		
		// Look at my Player code to see how I made an array of enemies then proceeded to fight them
	}

}
