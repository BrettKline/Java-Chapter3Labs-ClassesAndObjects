import java.util.Scanner;
public class Prog10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pet myPet = new Pet();
		System.out.println("Input your pet's name, then type, then age.");
		myPet.setName(input.nextLine());
		myPet.setType(input.nextLine());
		myPet.setAge(input.nextInt());
		
		System.out.printf("Your pet is a %s named %s who is %d year(s) old.", myPet.getType(), myPet.getName(), myPet.getAge());

	}

}
