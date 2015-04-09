import java.util.Scanner;

public class Frence_hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("input the redius of a circle:");
		double redius = keyboard.nextDouble();
		double pi = 3.14159;
		
		System.out.printf("diameter:%.0f", redius*2);
		System.out.println();
		System.out.printf("circumference:%.4f", 2*pi*redius);
		System.out.println();
		System.out.printf("area:%.5f", redius*redius*pi);
	}

}
