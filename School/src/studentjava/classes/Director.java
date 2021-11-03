package studentjava.classes;

public class Director extends People {
	
	private String registrationEducation;
	private int timeDirection;
	private String titration;
	
	public String getRegistration() {
		return registrationEducation;
				
	}
	public void setRegistrationEducation(String registrationEducation) {
		this.registrationEducation = registrationEducation;
	}
	public int getTimeDirection() {
		return timeDirection;
	}
	public void setTimeDirection(int timeDirection) {
		this.timeDirection = timeDirection;
	}
	public String getTitration() {
		return titration;
	}
	public void setTitration(String titration) {
		this.titration = titration;
	}
	@Override
	public String toString() {
		return "Director [registrationEducation=" + registrationEducation + ", timeDirection=" + timeDirection
				+ ", titration=" + titration + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}