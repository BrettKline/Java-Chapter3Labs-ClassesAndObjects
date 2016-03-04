//Dependency: Car.java
public class Prog2 {
	
	public static void main(String[] args) {
		Car car1 = new Car(2005, "Rav4");
		
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		System.out.println("Begin braking sequence");
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
	}
	
}
