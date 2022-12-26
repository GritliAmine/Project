package oop;

public class Subscriber {
	  private String name;
	  private String email;
	  private String phone;
	  private String startTime;
	  private String endTime;

	  public Subscriber(String name, String email, String phone, String startTime, String endTime) {
	    this.name = name;
	    this.email = email;
	    this.phone = phone;
	    this.startTime = startTime;
	    this.endTime = endTime;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getPhone() {
	    return phone;
	  }

	  public void setPhone(String phone) {
	    this.phone = phone;
	  }
	  
	  public String getStartTime() {
		    return startTime;
		  }

		  public void setStartTime(String startTime) {
		    this.startTime = startTime;
		  }

		  public String getEndTime() {
		    return endTime;
		  }

		  public void setEndTime(String endTime) {
		    this.endTime = endTime;
		  }
	  
	  
	  
	  
	}
