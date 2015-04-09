
public class File extends Document{
	private String pathname;
	
	public File(){
		super();
		
		this.pathname = "";
	}
	
	public File(String theText, String thePathname){
		super(theText + thePathname);
		
		this.pathname = thePathname;
	}
	
	public void setPathname(String thePathname){
		this.pathname = thePathname;
	}
	
	public String getPathname(){
		return this.pathname;
	}
	
	public String toString(){
		return ("Text is " + getText() + "; Pathname is " + this.pathname);
	}
}