import java.util.Scanner;
public class Prog8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input three test scores.");
		TestScores student1 = new TestScores(input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.printf("The average score is %.2f.", student1.getAvgScore());
	}

}
