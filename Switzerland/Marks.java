import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Marks {
	private int Max_marks = 0, Min_marks = 0;
	
	public Marks(){
		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("marks.txt"));
			
			while(filein.hasNextLine() == true)
			{
				int number = filein.nextInt();
				
				setMax(number);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		
		try
		{
			filein = new Scanner(new FileInputStream("marks.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		
		this.Min_marks = this.Max_marks;
		
		while(filein.hasNextLine() == true)
		{
			int number = filein.nextInt();
			
			setMin(number);
		}
	}
	
	public void setMax(int number){
		if(number > this.Max_marks)
			this.Max_marks = number;
	}
	
	public void setMin(int number){
		if(number < this.Min_marks && number != 0)
			this.Min_marks = number;
	}
	
	public int getMax(){
		return this.Max_marks;
	}
	
	public int getMin(){
		return this.Min_marks;
	}

	public static void main(String[] args) {
		Marks test = new Marks();
		
		System.out.println("Maximum Marks Obtained: " + test.getMax());
		System.out.println("Minimum Marks Obtained: " + test.getMin());
	}

}
