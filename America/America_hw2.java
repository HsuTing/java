import java.util.Scanner;


public class America_hw2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int number = 0;
		do{
			System.out.printf("How many exercises to input?");
			number = keyboard.nextInt();
		}while(number <= 0);
		int i = 1, sum_score = 0, sum_point = 0;
		
		do{
			System.out.printf("Score received for exercise %d:", i);
			System.out.println();
			int score = keyboard.nextInt();
			System.out.printf("Total points possible for exercise %d:", i);
			System.out.println();
			int point = keyboard.nextInt();
			
			sum_score = sum_score + score;
			sum_point = sum_point + point;
			i = i + 1;
		}while(i <= number);
		
		System.out.printf("Your total is %d out of %d, or %.2f%%", sum_score, sum_point, (sum_score*100.0f/sum_point));
	}

}
