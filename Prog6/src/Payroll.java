
public class Payroll {
	private String name;
	private int idNumber;
	private double hourlyRate;
	private double hoursWorked;
	
	public Payroll(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}
	public double GrossPay() {
		return hourlyRate * hoursWorked;
	}
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
}
