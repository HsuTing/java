import java.util.Scanner;


public class Fraction {
	private int numerator, denominator;
	
	public Fraction(){
		setNumerator();
		setDenominator();
	}
	
	public void setNumerator(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input numerator:");
		this.numerator = keyboard.nextInt();
	}
	
	public void setDenominator(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input denominator:");
		this.denominator = keyboard.nextInt();
	}
	
	public void getRatio(){
		System.out.printf("%d/%d", numerator, denominator);
	}
	
	public boolean equals(Fraction a){
		int temp_numerator = 0, temp_denominator = 0;
		
		temp_numerator = a.numerator / gcd(a.numerator, this.numerator);
		temp_denominator = a.denominator / gcd(a.denominator, this.denominator);
		System.out.println(temp_numerator + " " + temp_denominator);
		
		if(temp_numerator == 1)
		{
			if(a.numerator == this.numerator)
				return true;
		}
		else
		{
			if(temp_numerator == temp_denominator)
				return true;
			else
				return false;
		}
		return false;
	}

	public int gcd(int a, int b) {
        int temp = 0;  
        do {  
            temp = a % b;
            a = b;
            b = temp;
        } while (temp != 0);  
        
        return a;
    }
	
	public static void main(String[] args) {
		final Fraction a = new Fraction();
		int answer = 1;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			Fraction b = new Fraction();
            
            System.out.println("The answer:" + b.equals(a));
            
			System.out.printf("continue?1.yes 2.no\n");
			System.out.printf("input:");
			answer = keyboard.nextInt();
		}while(answer == 1);
	}

}
