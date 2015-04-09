import java.util.Scanner;


public class HotDogStand {
	private String ID = "";
	private int values = 0;
	public static int total = 0;
	
	public HotDogStand()
	{
		setID();
		setValues();
		setTotal();
	}
	
	public void setID(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("inpu ID:");
		this.ID = keyboard.next();
	}
	
	public void setValues(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("inpu values:");
		this.values = keyboard.nextInt();
	}
	
	public void setTotal(){
		total = total + this.values;
	}
	
	public void justSold(){
		this.values = this.values + 1;
		total = total + 1;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public int getValues(){
		return this.values;
	}
	
	public static int getTotal(){
		return total;
	}
	
	public static void main(String[] args) {
		HotDogStand a = new HotDogStand();
		HotDogStand b = new HotDogStand();
		HotDogStand c = new HotDogStand();
		
		System.out.printf("Total values:%d", a.getTotal());
		System.out.println();
		System.out.printf("add %s.",a.getID());
		a.justSold();
		System.out.println();
		System.out.printf("%s`s values:%d\n",a.getID(), a.getValues());
		System.out.printf("%s`s values:%d\n",b.getID(), b.getValues());
		System.out.printf("%s`s values:%d\n",c.getID(), c.getValues());
		System.out.printf("Total values:%d", a.getTotal());
		System.out.println();
		
		System.out.printf("add %s.",b.getID());
		b.justSold();
		System.out.println();
		System.out.printf("%s`s values:%d\n",a.getID(), a.getValues());
		System.out.printf("%s`s values:%d\n",b.getID(), b.getValues());
		System.out.printf("%s`s values:%d\n",c.getID(), c.getValues());
		System.out.printf("Total values:%d", b.getTotal());
		System.out.println();
	}

}
