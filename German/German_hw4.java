import java.util.Scanner;
import java.util.StringTokenizer;

public class German_hw4 {
	private int num [], result [][], amount = 0;
	
	public German_hw4(){
		setNumber();
		array();
		count();
		getNum();
	}
	
	public void setNumber(){
		Scanner keyboard = new Scanner(System.in);
		String input;
		int i = 0;
		
		System.out.printf("input number:");
		input = keyboard.nextLine();
		
		StringTokenizer temp = new StringTokenizer(input);
		num = new int [temp.countTokens()];
		result = new int [temp.countTokens()][2];
		amount = temp.countTokens();
		
		while(temp.hasMoreTokens()){
			num[i] = Integer.parseInt(temp.nextToken());
			i++;
		}
	}
	
	public void array(){
		for(int i = 0; i < amount; i++)
			for(int j = i + 1; j < amount; j++)
				if(num[i] < num[j])
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
	}

	public void count(){
		int temp = 1, j = 0;
		for(int i = 1; i < amount; i++){
			if(num[i] == num[i - 1])
				temp = temp + 1;
			else{
				result[j][0] = num[i - 1];
				result[j][1] = temp;
				j = j + 1;
				temp = 1;
			}
			result[j][0] = num[amount-1];
			result[j][1] = temp;
		}
	}
	
	public void getNum(){
		System.out.println(" N  Count ");
		for(int i = 0, j = 0; i < amount; j++){
			if(result[j][0] >= 0)
				System.out.println(" " + result[j][0] + "    " + result[j][1]);
			else
				System.out.println(result[j][0] + "    " + result[j][1]);
			i = i + result[j][1];
		}
	}
	
	public static void main(String[] args) {
		German_hw4 a = new German_hw4();
	}

}
