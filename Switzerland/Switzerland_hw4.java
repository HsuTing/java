import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Switzerland_hw4 {
	private double a = 0, b = 0, c = 0, discriminant = 0.0, root1 = 0, root2 = 0;
	
	public Switzerland_hw4(){
		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("Switzerland_hw4.txt"));
			
			while(filein.hasNextLine() == true)
			{
				String temp = filein.nextLine();
				String[] number = temp.split(" ");
				
				setNumber(Integer.parseInt(number[0]), Integer.parseInt(number[1]), Integer.parseInt(number[2]));
				setDiscriminant();
				setRoot();
				
				System.out.printf("Discriminant = %.1f\n", getDiscriminant());
				if(real() == true && equal() == false){
					System.out.println("Roots are real and unequal");
					System.out.printf("Root1: %.1f\n", getRoot1());
					System.out.printf("Root2: %.1f\n", getRoot2());
				}
				else if(real() == true && equal() == true){
					System.out.println("Roots are equal");
					System.out.printf("Root: %.1f\n", getRoot1());
				}
				else{
					System.out.println("Roots are imaginary");
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
	}
	
	public void setNumber(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setDiscriminant(){
		this.discriminant = b * b - 4 * a * c;
	}
	
	public void setRoot(){
		this.root1 = (-b + Math.sqrt(this.discriminant) ) / (2 * a);
		this.root2 = (-b - Math.sqrt(this.discriminant) ) / (2 * a);
	}
	
	public double getDiscriminant(){
		return this.discriminant;
	}
	
	public double getRoot1(){
		return this.root1;
	}
	
	public double getRoot2(){
		return this.root2;
	}
	
	public boolean real(){
		if(this.discriminant >= 0)
			return true;
		else
			return false;
	}
	
	public boolean equal(){
		if(this.root1 == this.root2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Switzerland_hw4 test = new Switzerland_hw4();
	}

}
