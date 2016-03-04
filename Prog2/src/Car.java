//Dependency: Prog2.java
public class Car {
		//fields
		private int yearModel;
		private String make;
		private int speed;

		//constructors
		public Car(int inputYearModel, String inputMake) {
			yearModel = inputYearModel;
			make = inputMake;
			speed = 0;
		}
		public Car() {
			
		}
		//mutators
		
		public void accelerate() {
			speed += 5;
		}
		
		public void brake() {
			speed -= 5;
		}
		//accessors
		public String getMake() {
			return make;
		}
		public int getYearModel() {
			return yearModel;
		}
		public int getSpeed() {
			return speed;
		}
	}