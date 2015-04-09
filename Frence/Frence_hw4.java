import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Frence_hw4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner filein = null;
		try
		{
			filein = new Scanner(new FileInputStream("input.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		
		String sentence = filein.nextLine();
		System.out.printf("%s",sentence.substring(0,sentence.indexOf("hate",1)));
		System.out.printf("love");
		System.out.printf("%s",sentence.substring(sentence.indexOf("hate",1)+4));
	}

}
