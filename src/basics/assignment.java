package basics;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int som = 4;
		System.out.println("The sum of " + som +" equal to "+ sum(som));
		int[] numbers = {3,5,-2,3,4};
		System.out.println(min(numbers));
		System.out.printf("The average of the array is %.2f",  avg(numbers));

	}
	
	public static int sum(int n) {
		
		int s = 0;
		for (int i=1; i<=n;i++) {
			System.out.print(i + " + " + s + " = ");
			s+=i;
			System.out.println(s);
		}
		return s;
	}
	
	public static double avg(int[] numb) {
		int ss = 0;
		for (int i=0; i<numb.length;i++) {
			ss +=numb[i];
		}
		double avrg = (double) ss/numb.length;
		System.out.println("The sum of numbers in an array is " + ss);
		System.out.println("The length of an array is " + numb.length);
		return avrg;
	}
	
	public static int min(int[] house) {
		int min = house[0];
		for (int i=0;i<house.length;i++) {
			if (house[i] < min) {
				min = house[i];
			}
		}
		return min;
	}

}
