import java.util.Scanner;


public class CreditCardSale extends Sale{
	private String name = "";
	private int expiration_data = 0, number = 0;
	
	public CreditCardSale(){
		setname();
		setexpiration_data();
		setnumber();
	}
	
	public void setname(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input name:");
		this.name = keyboard.nextLine();
	}
	
	public void setexpiration_data(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input expiration data:");
		this.expiration_data = keyboard.nextInt();
	}
	
	public void setnumber(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input number:");
		this.number = keyboard.nextInt();
	}
	
	public void SaleDetails(){
		System.out.println("The name on the card: " + this.name);
		System.out.println("The expiration date: " + this.expiration_data);
		System.out.println("The credit card number: " + this.number);
	}
}
