package basics;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program is starting");
		
		printName();
		int numA = 27;
		int numB = 10;
		addNumbers(numA, numB);
		System.out.println("print multiply " + multiplyNumbers(numA, numB));
		
		
		

	}
	static void printName() {
		System.out.println("My name is Amine");
	}
	static void addNumbers(int x, int y) {
		int z = x + y;
		System.out.println("print add numbers " + z);
	}
	static int multiplyNumbers(int x, int y) {
		int z = x * y;
		addNumbers(z, z);
		return z;
	}

}
