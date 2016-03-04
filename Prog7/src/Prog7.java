import java.util.Scanner;
public class Prog7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many widgets do you need?");
		Widget order = new Widget(input.nextInt());
		System.out.printf("The job of %d widgets will take %.2f days.", order.getNumWidgets(), order.getWidgetDays());

	}

}
