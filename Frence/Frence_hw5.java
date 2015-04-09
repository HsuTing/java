import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Frence_hw5 {

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

		
		while(filein.hasNextLine() == true)
		{
			String name = filein.nextLine();
			int feet = filein.nextInt();
			int inch = filein.nextInt();
			
			for(int i = 5; i < feet; i++)
				inch+=12;
			
			System.out.printf("%s is %d", name, 110+inch*5);
			System.out.println();
			
			if(filein.hasNextLine() == false)
				break;
			filein.nextLine();
		}
	}

}
