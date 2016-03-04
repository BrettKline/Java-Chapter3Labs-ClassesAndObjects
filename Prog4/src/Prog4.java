import java.util.Scanner;
//Uses Temperature.java
public class Prog4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What temperature is it?");
		double inputTemp = input.nextDouble();
		Temperature temp = new Temperature(inputTemp);
		System.out.printf("It is %.2f degrees Celsius and %.2f degrees Kelvin.", temp.getCTemp(), temp.getKTemp());
		input.close();
	}

}
