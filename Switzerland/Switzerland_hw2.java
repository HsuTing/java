import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Switzerland_hw2{
	private double sum = 0.0;
	private int amount = 0;
	
	public Switzerland_hw2(){
		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("Switzerland_hw2.txt"));
			
			while(filein.hasNextLine() == true)
			{
				double number = filein.nextDouble();
				setSum(number);
				setAmount();
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
	}
	
	public void setSum(double number){
		this.sum = this.sum + number;
	}
	
	public void setAmount(){
		this.amount = this.amount + 1;
	}
	
	public double getSum(){
		return this.sum;
	}
	
	public double getAmount(){
		return this.amount;
	}

	public static void main(String[] args) {
		Switzerland_hw2 test = new Switzerland_hw2();
		
		System.out.printf("This average is %.4f", ( test.getSum() / test.getAmount()) );
	}

}
