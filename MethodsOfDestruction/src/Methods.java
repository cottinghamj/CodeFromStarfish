
public class Methods {

	public static void main(String[] args) {
		System.out.println(add(10, 9, 2));
		// Methods are good for preventing a lot of repeated code
	}
	
	public static int add(int x, int y, int z){
		int answer = x + y + z;
		return answer;
	}
}
