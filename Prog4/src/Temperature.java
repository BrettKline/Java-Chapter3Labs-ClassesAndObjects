//Uses Prog4.java
public class Temperature {
	private double FTemp;

	public Temperature(double fTemp) {
		FTemp = fTemp;
	}

	public double getFTemp() {
		return FTemp;
	}
	
	public double getCTemp() {
		return (5.0/9.0) * (FTemp - 32.0);
	}
	
	public double getKTemp() {
		return (5.0/9.0) * (FTemp - 32.0) + 273.0;
	}

	public void setFTemp(double fTemp) {
		FTemp = fTemp;
	}
	
}
