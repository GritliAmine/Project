package basics;

public class cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare & Define an array with cities names
		String[] cities = {"kelibia", "manzel temim", "haweria", "hammem ghzez"};
		System.out.println(cities[0]);
		
		// Declare and define an array with states
		String[] states = new String[2];
		states[0] = "nabeul";
		states[1] = "Sfax";
		System.out.println(states[1]);
		/** **/
		System.out.println("***********************************");
		// Declare array
		String [] countries;
		
		// Define array
		countries = new String[3];
		countries[0] = "France";
		countries[1] = "Tunisie";
		countries[2] = "Germany";
		
		
		// Do loop : enters the loop then tests condition
		int i = 0;
		do {
			System.out.println(cities[i]);
			i += 1;
		} while (i<4);
		System.out.println("***********************************");
		
		// While loop: test condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = countries[n];
			System.out.println(state);
			if (state == "Tunisie") {
				System.out.println("State Found!");
				stateFound = true;
			}
			n++;
		}
		
		// Other example
		System.out.println("***********************************");
		int s = 0;
		boolean findCity = false;
		while(!findCity) {
			String city = cities[s];
			System.out.println(city);
			if (city == "haweria") {
				System.out.println("City found");
				findCity = true;
			}
			
			s++;
		}
		
		System.out.println("***********************************");
		// For loop : best structure for iterating  through an array
		
		for (int x=0; x<2; x++) {
			System.out.println(states[x]);
		}

	}

}
