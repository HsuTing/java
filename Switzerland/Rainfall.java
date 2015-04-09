import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Rainfall {
	ArrayList<Double> rain = new ArrayList<Double>();
	
	public Rainfall(){
		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("Rainfall.txt"));
			
			while(filein.hasNextLine() == true)
			{
				double number = filein.nextDouble();
				
				setRain(number);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
	}
	
	public void setRain(double number){
		this.rain.add(number);
	}
	
	public double getRain(int index){
		return this.rain.get(index);
	}
	
	public void showStar(int index){
		for(int i = 0; i < getRain(index) / 100; i++){
			System.out.printf("*");
		}
		System.out.println();
	}
	
	public void showTotal(){
		for(int i = 0; i < this.rain.size(); i++){
			showStar(i);
		}
	}
	
	public double showAverage(){
		double sum = 0.0;
		
		for(int i = 0; i < this.rain.size(); i++){
			sum = sum + this.rain.get(i);
		}
		
		return sum / this.rain.size();
	}

	public static void main(String[] args) {
		Rainfall test = new Rainfall();
		
		test.showTotal();
		System.out.printf("Average Rainfall: %.4f mm", test.showAverage());
	}

}
