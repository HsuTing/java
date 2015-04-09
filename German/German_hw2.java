import java.util.Scanner;


public class German_hw2 {
	public int stores [][] = new int [5][4];
	public String name [] = new String [5];
	
	public German_hw2(){
		for(int i = 0; i < 5; i++)
		{
			setStoreName(i);
			setStoreSale(i);
		}
	}
	
	public void setStoreName(int i){
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input store`s name:");
		this.name[i] = keyboard.next();
	}
	
	public void setStoreSale(int i){
		Scanner keyboard = new Scanner(System.in);
		
		for(int j = 0; j < 4; j++)
		{
			System.out.printf("input %d quarter:", j+1);
			this.stores[i][j] = keyboard.nextInt();
		}
	}
	
	public void getStoreSale(int i, int j){
		System.out.printf("%s store`s %d quarter:%d\n",name[i], j+1, stores[i][j]);
	}
	
	public void getTotalSaleEachStore(int i){
		System.out.printf("%s store`s total sales:%d\n",name[i], stores[i][0] + stores[i][1] + stores[i][2] + stores[i][3]);
	}
	
	public void getAverageSaleEachStore(int i){
		System.out.printf("%s store`s average sales:%.2f\n",name[i], (stores[i][0] + stores[i][1] + stores[i][2] + stores[i][3]) / 4.0f);
	}
	
	public void getTotalSaleEachQuarter(int j){
		System.out.printf("%d quarter`s total sales:%d\n", j+1, stores[0][j] + stores[1][j] + stores[2][j] + stores[3][j] + stores[4][j]);
	}
	
	public void getAverageSaleEachQuarter(int j){
		System.out.printf("%d quarter`s average sales:%.2f\n", j+1, (stores[0][j] + stores[1][j] + stores[2][j] + stores[3][j] + stores[4][j]) / 5.0f);
	}
	
	public void getHighestSaleEachQuarter(int j){
		int temp = getCompare(j);
		
		for(int i = 0; i < 5; i++){
			if(stores[i][j] == temp)
				System.out.printf("%s store`s in %d quarter is highest.\n", name[i], j+1);
		}
	}
	
	public int getCompare(int j){
		int temp = 0;
		
		for(int i = 0; i < 5; i++){
			if(stores[i][j] >= temp)
				temp = stores[i][j];
		}
		
		return temp;
	}

	public static void main(String[] args) {
		German_hw2 a = new German_hw2();
		
		System.out.println("The sales figure for each store in each quarter.");
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 4; j++)
				a.getStoreSale(i, j);
		System.out.println("The total sales for each store.");
		for(int i = 0; i < 5; i++)
			a.getTotalSaleEachStore(i);
		System.out.println("The average sales for each store.");
		for(int i = 0; i < 5; i++)
			a.getAverageSaleEachStore(i);
		System.out.println("The total sales for each quarter.");
		for(int j = 0; j < 4; j++)
			a.getTotalSaleEachQuarter(j);
		System.out.println("The average sales per quarter.");
		for(int j = 0; j < 4; j++)
			a.getAverageSaleEachQuarter(j);
		System.out.println("The store with the highest sales for each quarter.");
		for(int j = 0; j < 4; j++)
			a.getHighestSaleEachQuarter(j);
	}

}
