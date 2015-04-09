import java.util.Scanner;


public class America_hw3 {
	
	public static double n_class(double n){
		if(n > 1)
			return n*n_class(n-1);
		else
			return 1;
	}
	
	public static double n_power(double x, double n){
		double sum = 1.0f;
		for(int i = 0; i < n; i++){
			sum = sum * x;
		}
		return sum;
	}
	
	public static double function(double x, double n){
		double sum = 1.0f;
		for(int i = 1; i <= n; i++){
			sum = sum + (n_power(x, i)/n_class(i));
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double number = 0.0f;
		int answer = 0;
		do{
			do{
				System.out.printf("input:");
				number = keyboard.nextInt();
			}while(number <= 0.0f);
			
			for(int i = 1; i <= 10; i++){
				System.out.printf("when n = %d,sum = %.2f", i, function(number, i));
				System.out.println();
			}
			System.out.printf("when n = 50,sum = %.2f", function(number, 50));
			System.out.println();
			System.out.printf("when n = 100,sum = %.2f", function(number, 100));
			System.out.println();
			
			System.out.println("again?1.Yes 0.No");
			answer = keyboard.nextInt();
		}while(answer == 1);
	}

}
