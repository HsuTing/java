import java.util.ArrayList;

public class MultiItemSale {
	private ArrayList <Sale> sale = new ArrayList<Sale>();
	private int amount;
	private double totalbill;
	
	public MultiItemSale(){
		this.amount = 0;
		this.totalbill = 0;
	}

	public void addList(Sale temp){
		sale.add(temp);
		this.amount = this.amount + 1;
		totalbill = totalbill + temp.bill();
	}
	
	public void print(){
		for(int i = 0; i < sale.size(); i++){
			System.out.println();
			System.out.println("This is " + (i + 1) + " item in MultiItemSale");
			System.out.println(sale.get(i).toString());
		}
		System.out.println();
		System.out.println("Total bill: " + this.getTotalbill());
	}
	
	public double getTotalbill(){
		return this.totalbill;
	}
	
	public static void main(String[] args) {
		MultiItemSale total = new MultiItemSale();
		ArrayList <Sale> test = new ArrayList<Sale>();
		
		Sale sale_a = new Sale("frist", 1);
		total.addList(sale_a);
		System.out.println("Creat a sale -> " + sale_a.toString());
		Sale sale_b = new Sale("Second", 2);
		total.addList(sale_b);
		System.out.println("Creat a sale -> " + sale_b.toString());
		DiscountSale discountsale_a = new DiscountSale("third", 3, 3);
		total.addList(discountsale_a);
		System.out.println("Creat a sale -> " + discountsale_a.toString());
		DiscountSale discountsale_b = new DiscountSale("forth", 4, 4);
		total.addList(discountsale_a);
		System.out.println("Creat a sale -> " + discountsale_b.toString());
		
		total.print();		
	}
}