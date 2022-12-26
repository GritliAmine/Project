package basics;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
		System.out.println(fac(4));
		
		int[] array = {4, 4, 6, 4, 7};
		System.out.println(min(array));
		System.out.println(avg(array));
		System.out.println(max(array));

		
		
		

	}
	
	public static int sum(int n) {
		  int sum = 0;
		  for (int i = 1; i <= n; i++) {
		    sum += i;
		  }
		  return sum;
		}
	
	public static int fac(int n) {
		
		if (n==0) {
			return 1;
		}
		
		else {
			return n * fac(n-1);
		}
	}
	
	
	
	

	
	// Returns the minimum value in the array
	public static int min(int[] array) {
	  int min = array[0];
	  for (int i = 1; i < array.length; i++) {
	    if (array[i] < min) {
	      min = array[i];
	    }
	  }
	  return min;
	}

	// Returns the average value of the array
	public static double avg(int[] array) {
	  int sum = 0;
	  for (int i = 0; i < array.length; i++) {
	    sum += array[i];
	  }
	  return (double) sum / array.length;
	}

	// Returns the maximum value in the array
	public static int max(int[] array) {
	  int max = array[0];
	  for (int i = 1; i < array.length; i++) {
	    if (array[i] > max) {
	      max = array[i];
	    }
	  }
	  return max;
	}

	
	
}