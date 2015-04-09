import java.util.Scanner;


public class Sale {
	protected double amount = 0;

	public void setAmount(){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input amount:");
		this.amount = keyboard.nextInt();
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public void SaleDetails(){
		System.out.println("amount is " + String.valueOf(this.amount));
	}

	public static void main(String[] args) {
		CashSale CashSale_A = new CashSale();
		CashSale CashSale_B = new CashSale();
		CreditCardSale CreditCardSale_A = new CreditCardSale();
		CreditCardSale CreditCardSale_B = new CreditCardSale();
		
		System.out.printf("CashSale_A:");
		CashSale_A.SaleDetails();
		System.out.println();
		System.out.printf("CashSale_B:");
		CashSale_B.SaleDetails();
		System.out.println();
		System.out.printf("CreditCardSale_A:\n");
		CreditCardSale_A.SaleDetails();
		System.out.println();
		System.out.printf("CreditCardSale_B:\n");
		CreditCardSale_B.SaleDetails();
		System.out.println();
	}

}
