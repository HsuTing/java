import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class German_hw5 {
	private String temp[], resultChar[], wordChar[];
	private	int resultCount[], wordCount[];
	
	public German_hw5(){
		setCompose();
		array();
		count();
	}
	
	public void setCompose(){
		Scanner keyboard = new Scanner(System.in);
		String input;
		
		System.out.printf("input word:");
		input = keyboard.nextLine();
		
		temp = new String [input.length()];
		
		for(int i = 1; i < input.length(); i++){
			temp[i - 1] = input.substring(i - 1, i);
		}
		temp[input.length() - 1] = input.substring(input.length() - 1);
	}
	
	public void setWord(){
		Scanner fileIn = null;
		int countCompare = 0;
		
		try
		{
			fileIn = new Scanner(new FileInputStream("words.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		
		while(fileIn.hasNextLine()){
			String word = fileIn.nextLine();
			wordChar = new String [temp.length];
			wordCount = new int [temp.length];
			
			for(int i = 0, j = 0; i < resultChar.length; j++){
				int count = 0;
				for(int k = 0; k < word.length(); k++){
					if(word.indexOf(resultChar[j], k) == -1){
						System.out.println(word + resultChar[j]);
						count = k - 1;
						break;
					}
				}
				i = i + resultCount[j];
				
				wordChar[j] = resultChar[j];
				wordCount[j] = count;
			}
			
			int finalCount = 0;
			for(int i = 0, j = 0; i < temp.length; j++){
				if(resultCount[j] == wordCount[j])
					finalCount = finalCount + resultCount[j];
				i = i + resultCount[j];
			}
			
			if(finalCount == temp.length)
				System.out.println(word);
		}
		
		fileIn.close();
	}
	
	public void array(){
		for(int i = 0; i < temp.length; i++)
			for(int j = i + 1; j < temp.length; j++)
				if(temp[i].compareTo(temp[j]) < 0)
				{
					String tempT = temp[i];
					temp[i] = temp[j];
					temp[j] = tempT;
				}
	}
	
	public void count(){
		int tempT = 1, j = 0;
		resultChar = new String [temp.length];
		resultCount = new int [temp.length];
		
		for(int i = 1; i < temp.length; i++){
			if(temp[i].compareTo(temp[i - 1]) == 0)
				tempT = tempT + 1;
			else{
				resultChar[j] = temp[i - 1];
				resultCount[j] = tempT;
				j = j + 1;
				tempT = 1;
			}
			resultChar[j] = temp[temp.length-1];
			resultCount[j] = tempT;
		}
	}

	public static void main(String[] args) {
		German_hw5 a = new German_hw5();
		
		a.setWord();
	}
}
