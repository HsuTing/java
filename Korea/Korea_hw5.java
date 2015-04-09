import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Korea_hw5 {
	public int A_rate = 0,  B_rate = 0, C_rate = 0, D_rate = 0, E_rate = 0;
	public int A_number = 0, B_number = 0, C_number = 0, D_number = 0, E_number = 0;
	
	public void setTotal(String input){		
		StringTokenizer temp = new StringTokenizer(input, ",");
		int [] a = new int [5];
		int i = 0;
		for(int j = 0; j < 5; j++)
			a[j] = 0;
		
		while(temp.hasMoreTokens()){
			a[i] = Integer.parseInt(temp.nextToken());
			i++;
		}
		addA(a[0]);
		addB(a[1]);
		addC(a[2]);
		addD(a[3]);
		addE(a[4]);
	}
	
	public int getA(){
		return this.A_rate;
	}
	
	public int getB(){
		return this.B_rate;
	}
	
	public int getC(){
		return this.C_rate;
	}
	
	public int getD(){
		return this.D_rate;
	}
	
	public int getE(){
		return this.E_rate;
	}
	
	public int getANumber(){
		return this.A_number;
	}
	
	public int getBNumber(){
		return this.B_number;
	}
	
	public int getCNumber(){
		return this.C_number;
	}
	
	public int getDNumber(){
		return this.D_number;
	}
	
	public int getENumber(){
		return this.E_number;
	}
	
	public void addA(int temp){
		if(temp != 0){
			this.A_rate = this.A_rate + temp;
			addANumber();
		}
		else{
			return ;
		}
	}
	
	public void addB(int temp){
		if(temp != 0){
			this.B_rate = this.B_rate + temp;
			addBNumber();
		}
		else{
			return ;
		}
	}
	
	public void addC(int temp){
		if(temp != 0){
			this.C_rate = this.C_rate + temp;
			addCNumber();
		}
		else{
			return ;
		}
	}
	
	public void addD(int temp){
		if(temp != 0){
			this.D_rate = this.D_rate + temp;
			addDNumber();
		}
		else{
			return ;
		}
	}
	
	public void addE(int temp){
		if(temp != 0){
			this.E_rate = this.E_rate + temp;
			addENumber();
		}
		else{
			return ;
		}
	}
	
	public void addANumber(){
		this.A_number ++;
	}
	
	public void addBNumber(){
		this.B_number ++;
	}
	
	public void addCNumber(){
		this.C_number ++;
	}
	
	public void addDNumber(){
		this.D_number ++;
	}
	
	public void addENumber(){
		this.E_number ++;
	}
	
	public static void main(String[] args) {
		Korea_hw5 a = new Korea_hw5();
		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("input.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}

		filein.nextLine();
		
		while(filein.hasNextLine() == true)
		{
			a.setTotal(filein.nextLine());
		}
		
		System.out.printf("A:%.1f\n", 1.0f*a.getA()/a.getANumber());
		System.out.printf("B:%.1f\n", 1.0f*a.getB()/a.getBNumber());
		System.out.printf("C:%.1f\n", 1.0f*a.getC()/a.getCNumber());
		System.out.printf("D:%.1f\n", 1.0f*a.getD()/a.getDNumber());
		System.out.printf("E:%.1f\n", 1.0f*a.getE()/a.getENumber());
	}

}
