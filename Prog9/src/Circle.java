
public class Circle {
	private double radius;
	final private double PI = 3.14159;
	private double area;
	private double diameter;
	private double circumference;
	
	public Circle(double radius) {
		this.radius = radius;
		area = PI * radius * radius;
		diameter = radius * 2;
		circumference = 2 * PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}

	public double getArea() {
		return area;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		area = PI * radius * radius;
		diameter = radius * 2;
		circumference = 2 * PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [area=" + area + ", diameter=" + diameter + ", circumference=" + circumference + "]";
	}
}
