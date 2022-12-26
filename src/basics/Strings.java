package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start program");
		String bookTitle;
		String wordChoose = "Amine";
		bookTitle = "Amine is a software engineer";
		if (bookTitle.contains(wordChoose)) {
			System.out.println("the book contains  the word : " + wordChoose);
		}
		
		// Ignore Cases "UpperCase" and "Lowercase"
		
		String browser = "chrOme";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Amine";
		String LastName = "Gritli";
		String CIN = "098138944";
		
		// Length
		
		System.out.println("There are " + CIN.length() + " digits in your CIN");
		
		// print initials plus last 4 digits of CIN
		System.out.print(firstName.substring(0,1));
		System.out.print(LastName.substring(0,1));
		System.out.println(CIN.substring(5));

	}

}
