import java.util.Scanner;


public class CashSale extends Sale{
	private double cash = 0;
	
	public CashSale(){
		setAmount();
		cash = amount;
	}
	
	public void SaleDetails(){
		System.out.println(cash + " in cash.");
	}
}
