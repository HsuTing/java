import java.util.Scanner;


public class Document {
	private String text = "";
	
	public Document(){
		this.text = "";
	}
	
	public Document(String theText){
		this.text = theText;
	}
	
	public String toString(){
		return text;
	}
	
	public void setText(String theText){
		this.text = theText;
	}
	
	public String getText(){
		return this.text;
	}
	
	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
	    if (docObject.toString().indexOf(keyword,0) >= 0)
	        return true ;
	    return false ;
	}
	
	public static void main(String[] args) {
		Email a = new Email("a", "b", "c", "d");
		File b = new File("a", "b");
		
		System.out.println("Tmail(a, b, c, d)");
		System.out.println(a.toString());
		System.out.println("File(a,b)");
		System.out.println(b.toString());
		System.out.println("Test a.ContainsKeyboard(a,Text):");
		System.out.println(a.ContainsKeyword(a, "Text"));
		System.out.println("Test a.ContainKeyboard(b,Text)");
		System.out.println(a.ContainsKeyword(b, "Text"));
		System.out.println("Text a.ContainKeynoard(a,test)");
		System.out.println(a.ContainsKeyword(a, "test"));
	}

}
