package basics;

public class Salaries {
	public static void main(String[] arg) {
		// Déclarer une variabe
		String Career;
		System.out.println("Program is Starting");
		
		// Define a variable
		Career = "Engineer";
		System.out.println("My career is an :" + Career);
		
		// Declare variable
		int hoursPerWeek = 37;
		double weeksPerMonths = 4.5;
		double hourPrice = 13;
		
		double salary = hoursPerWeek * weeksPerMonths * hourPrice;
		Career = "Software Engineer";
		System.out.println("My salary as a "+ Career + " is $" + salary + " and i work "+ hoursPerWeek + " hours per week");
		
		if (salary > 2000) {
			System.out.println("I have a good Salary");
			
		}
		else {
			System.out.println("My salary is less than 2000");
		}
		
	}
}
