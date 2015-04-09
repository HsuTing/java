
public class America_hw4 {
	public static int power(int time){
		int sum = -1;
		for(int i = 0; i < time; i++){
			sum = sum * -1;
		}
		return sum;
	}
	
	public static double function(int number){
		double sum = 0.0f;
		for(int i = 1; i <= number; i++){
			sum = sum + 4.0f*power(i)/(i*2-1);
		}
		return sum;
	}

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++){
			System.out.printf("%d00 terms = %.5f", i, function(i*100));
			System.out.println();
		}
	}

}
