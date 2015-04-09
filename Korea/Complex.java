import java.util.Scanner;


public class Complex {
	private int real = 0;
	private int complex = 0;
	
	public Complex(){
		setReal();
		setComplex();
	}
	
	public void setReal(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input real part:");
		this.real = keyboard.nextInt();
	}
	
	public void setComplex(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input complex part:");
		this.complex =  keyboard.nextInt();
	}
	
	public int getReal(){
		return real;
	}
	
	public int getComplex(){
		return complex;
	}
	
	public boolean equals(Complex a){		
		if(this.real == a.real){
			if(this.complex == a.complex){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		Integer a = this.real;
		Integer b = this.complex;
		
		if(this.complex < 0){
			return a.toString() + b.toString() + "i";
		}
		else if(this.complex == 0){
			return a.toString() ;
		}
		return a.toString() + "+" + b.toString() + "i";
	}
	
	public void addition(Complex a){
		int result = this.complex + a.complex;
		
		if(result < 0){
			System.out.printf("the result = %d%di", this.real + a.real, result);
		}
		else if(result == 0){
			System.out.printf("the result = %d", this.real + a.real);
		}
		else{
			System.out.printf("the result = %d+%di", this.real + a.real, result);
		}
		System.out.println();
		return;
	}
	
	public void subtraction(Complex a){
		int result = this.complex - a.complex;
		
		if(result < 0){
			System.out.printf("the result = %d%di", this.real - a.real, result);
		}
		else if(result == 0){
			System.out.printf("the result = %d", this.real - a.real);
		}
		else{
			System.out.printf("the result = %d+%di", this.real - a.real, result);
		}
		System.out.println();
		return;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Complex a = new Complex();
		
		int choice = 0;
		
		do{
			System.out.println("which you want to do?");
			System.out.println("1.equals 2.print 3.addition 4.subtraction (enter ant key to exit)");
			choice = keyboard.nextInt();
			
			switch(choice){
				case 1:
					Complex b = new Complex();
					System.out.println(a.equals(b));
					break;
				case 2:
					System.out.println(a.toString());
					break;
				case 3:
					Complex c = new Complex();
					a.addition(c);
					break;
				case 4:
					Complex d = new Complex();
					a.subtraction(d);break;
				default:break;
			}
		}while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
	}

}
