import java.util.Random;

public class LoadedDice extends Random{

	@Override public int nextInt(int num){
		if(num <= 0)
			throw new IllegalArgumentException("num must be positive");
		
		Random a = new Random();
		int temp = a.nextInt(2) + 1;
		
		if(temp == 1)
			return num - 1;
		else
			return a.nextInt(num);
	}
	
	public static void printDiceRolls(Random randGenerator)
	{
	    for ( int i = 0; i < 100; i++)
	    {
	        System.out.println(randGenerator.nextInt(6) + 1);
	    }
	}
	
	public static void main(String[] args) {
		LoadedDice myDice = new LoadedDice();
		printDiceRolls(myDice);
	}

}
