import java.util.Scanner;


public class America_hw1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double number = 0.0f;
		do{
			System.out.printf("input:");
			number = keyboard.nextInt();
		}while(number <= 0);
		double guess_one = number/2;
		double guess_two = guess_one;
		
		while(guess_one/guess_two > 0.01)
		{
			guess_two = guess_one;
			double r = number/guess_one;
			guess_one = (guess_one+r)/2;
			if(guess_one == guess_two)
				break;
		}
		
		System.out.printf("the answer:%.2f", guess_one);
	}

}
