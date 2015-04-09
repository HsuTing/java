import java.util.Scanner;

public class Frence_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("input(three integers):");
		int numberOne = keyboard.nextInt();
		int numberTwo = keyboard.nextInt();
		int numberThree = keyboard.nextInt();
		int sum = numberOne + numberTwo + numberThree;
		double average = sum/3.0f;
		
		System.out.printf("sum: %d", sum);
		System.out.println();
		System.out.printf("average: %.2f", average);
	}

}
