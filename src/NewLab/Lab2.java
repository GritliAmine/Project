package NewLab;

public class Lab2 {
	public static void main(String[] arg) {
		// Create a student
		Student stu1 = new Student("Janelle","45676543");
		Student stu2 = new Student("Amine","87653445");
		Student stu3 = new Student("Safa","23475643");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		stu1.showCourses();
		stu1.payTutotion(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

class Student{
	// Properties
	private static int iD=1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;

	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		//setAccountID();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase()+ "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max-min)));
		randNum = randNum + min;
		userId = iD + "" + randNum +  ssn.substring(0,2);
		
		System.out.println("Your UserId " + userId);
	}
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
	}
	
	public void payTutotion(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
		
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	public void checkBalancss() {
		System.out.println("Adding file from github $" + balance);
		
	}
	public void showCourses() {
		System.out.println(courses);
		
	}
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + " ]\n[BALANCE: $" + balance + " ]";		
	}
}
