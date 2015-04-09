
public class BeerSong {
	private int number;
	
	public BeerSong(String input){
		int temp = Integer.parseInt(input);
		
		if(temp > 99)
			number = 99;
		else if(temp < 0)
			number = 0;
		else
			number = temp;
		
		return;
	}
	
	public void printSong(){
		for(int i = number; i >= 0; i--){
			int temp_frist = i / 10;
			int temp_second = i % 10;
			String frist = "", second = "", result = "";
			
			if(i >= 10 && i < 20){
				switch(i){
				case 10:result = "ten";break;
				case 11:result = "eleven";break;
				case 12:result = "twelve";break;
				case 13:result = "thirteen";break;
				case 14:result = "fourteen";break;
				case 15:result = "fifteen";break;
				case 16:result = "sixteen";break;
				case 17:result = "seventeen";break;
				case 18:result = "eighteen";break;
				case 19:result = "nineteen";break;
				}
			}
			else if(i == 0){
				result = "zero";
			}
			else{
				switch(temp_frist){
					case 2:frist = "twenty"; break;
					case 3:frist = "thirty"; break;
					case 4:frist = "forty"; break;
					case 5:frist = "fifty"; break;
					case 6:frist = "sixty"; break;
					case 7:frist = "seventy"; break;
					case 8:frist = "eighty"; break;
					case 9:frist = "ninety"; break;
					default:frist= "";break;
				}
				switch(temp_second){
					case 1:second = "one"; break;
					case 2:second = "two"; break;
					case 3:second = "three"; break;
					case 4:second = "four"; break;
					case 5:second = "five"; break;
					case 6:second = "six"; break;
					case 7:second = "seven"; break;
					case 8:second = "eight"; break;
					case 9:second = "nine"; break;
					default:second = "";
				}
				if(second == ""){
					result = frist;
				}else if(frist == ""){
					result = second;
				}
				else{
					result= frist + "-" + second;
				}
			}
			if(i > 1){
				System.out.printf("%s", result.substring(0,1).toUpperCase());
				System.out.printf("%s", result.substring(1));
				System.out.println(" bottles of beer on the wall,");
				System.out.printf("%s", result.substring(0,1).toUpperCase());
				System.out.printf("%s", result.substring(1));
				System.out.println(" bottles of beer,");
				System.out.println("Take one down, pass it around,");
			}
			else if(i == 1){
				System.out.printf("%s", result.substring(0,1).toUpperCase());
				System.out.printf("%s", result.substring(1));
				System.out.println(" bottle of beer on the wall,");
				System.out.printf("%s", result.substring(0,1).toUpperCase());
				System.out.printf("%s", result.substring(1));
				System.out.println(" bottle of beer,");
				System.out.println("Take one down, pass it around,");
			}
			else{
				System.out.printf("%s", result.substring(0,1).toUpperCase());
				System.out.printf("%s", result.substring(1));
				System.out.println(" bottles of beer on the wall.");
			}
		}
	}
	
	public static void main(String[] args) {
		BeerSong a = new BeerSong(args[0]);
		a.printSong();
	}
}
