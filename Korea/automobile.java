import java.util.Scanner;


public class automobile {
	private String make, model, color, license;
	private int mileage = 0,  gasoline = 0;
	double fuelefficiency = 0.0f;
	
	public automobile(){
		setMake();
		setModel();
		setColor();
		setLicense();
	}
	
	public void setMake(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("inpu  make:");
		this.make = keyboard.next();
	}
	
	public void setModel(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input model:");
		this.model = keyboard.next();
	}
	
	public void setColor(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input color:");
		this.color = keyboard.next();
	}
	
	public void setLicense(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input license:");
		this.license = keyboard.next();
	}
	
	public void resetMileage(){
		this.mileage = 0;
		this.gasoline = 0;
	}
	
	public void setFuelEfficiency(){
		if(this.gasoline == 0){
			this.fuelefficiency = 0;
		}
		else{
			this.fuelefficiency = 1.0f*this.mileage/this.gasoline;
		}
	}
	
	public void consumedGasoline(int consumedGasoline){
		this.gasoline = this.gasoline + consumedGasoline;
	}
	
	public void addMile(int addMile){
		this.mileage = this.mileage + addMile;
	}
	
	public int getGasoline(){
		return this.gasoline;
	}
	
	public int getMileage(){
		return this.mileage;
	}
	
	public double getFuelefficiency(){
		return this.fuelefficiency;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		automobile a = new automobile();
		
		int choice = 0;
		
		do{
			System.out.println("Choose 1.add mile or 2.consumed gasoline");
			System.out.println("3.print mileage 4.print gasoline");
			System.out.println("5.fuel efficiency 6.reset Mileage(enter any key to exit)");
			choice = keyboard.nextInt();
			switch(choice){
				case 1:
					System.out.printf("Add mile:");
					int tempMile = keyboard.nextInt();
					a.addMile(tempMile);
					break;
				case 2:
					System.out.printf("consumed gasoline:");
					int tempGasoline = keyboard.nextInt();
					a.consumedGasoline(tempGasoline);
					break;
				case 3:
					System.out.printf("mileage:");
					System.out.printf(" %d miles\n", a.getMileage());
					break;
				case 4:
					System.out.printf("gasoline:");
					System.out.printf(" %d gallons\n", a.getGasoline());
					break;
				case 5:
					System.out.printf("fuel efficiency:");
					a.setFuelEfficiency();
					System.out.printf(" %.1f miles per gallon\n", a.getFuelefficiency());
					break;
				case 6:
					a.resetMileage();break;
				default:break;
			}
			System.out.println();
		}while(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6);
	}

}
