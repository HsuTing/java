import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Switzerland_hw5 {
	private String[] top5_name = new String[5];
	private int[] top5_score = new int[5];
	
	public Switzerland_hw5(){
		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("Switzerland_hw5.txt"));
			int amount = 0;
			
			while(filein.hasNextLine() == true){
				String name = filein.next();
				int score = filein.nextInt();
				
				setName(name, amount);
				setScore(score, amount);
				amount = amount + 1;
				filein.nextLine();
			}
		}
		catch(FileNotFoundException e)
		{
			try {
				PrintWriter writer = new PrintWriter(new FileOutputStream("Switzerland_hw5.txt"));
				for(int i = 0; i < 5; i++){
					writer.println("name");
					writer.println("0");
					setName("name", i);
					setScore(0, i);
				}
				writer.flush();
				writer.close();
			}
			catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void setName(String name, int index){
		this.top5_name[index] = name;
	}
	
	public void setScore(int score, int index){
		this.top5_score[index] = score;
	}
	
	public String[] getTopNames(){
		return this.top5_name;
	}
	
	public int[] getTopScores(){
		return this.top5_score;
	}
	
	public void playerScore(String name, int score){
		for(int i = 0; i < 5; i++){
			if(score > this.top5_score[i]){
				int tempScore = this.top5_score[i];
				this.top5_score[i] = score;
				score = tempScore;
				
				String tempName = this.top5_name[i];
				this.top5_name[i] = name;
				name = tempName;
			}
		}
		
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream("China_hw2.txt"));
			for(int i = 0; i < 5; i++){
				writer.println(this.top5_name[i]);
				writer.println(this.top5_score[i]);
			}
			writer.flush();
			writer.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Switzerland_hw5 test = new Switzerland_hw5();
		int choice = 1;
		
		do{
			System.out.printf("input Name:");
			String name = keyboard.next();
			System.out.printf("input score:");
			int score = keyboard.nextInt();
			
			test.playerScore(name, score);
			
			String[] tempName = test.getTopNames();
			int[] tempScore = test.getTopScores();			
			
			for(int i = 0; i < 5; i++){
				System.out.println(tempName[i]);
				System.out.println(tempScore[i]);
			}
			System.out.println();
			
			System.out.println("again?(1.)yes (2.)no");
			choice = keyboard.nextInt();
		}while(choice == 1);
		keyboard.close();
	}

}
