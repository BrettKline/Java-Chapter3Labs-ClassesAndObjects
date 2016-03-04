import java.util.Scanner;
public class Prog9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What radius does your circle have?");
		Circle myCircle = new Circle(input.nextDouble());
		System.out.println(myCircle.toString());
	}

}
