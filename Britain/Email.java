import java.util.Scanner;


public class Email extends Document{
	private String sender, recipient, title;
	
	public Email(){
		super();
		
		this.sender = "";
		this.recipient = "";
		this.title = "";
	}
	
	public Email(String theText, String theSender, String theRecipient, String theTitle){
		super (theText + theSender + theRecipient + theTitle);
		
		this.sender = theSender;
		this.recipient = theRecipient;
		this.title = theTitle;
	}
	
	public String getSender(){
		return this.sender;
	}
	
	public String getRecipient(){
		return this.recipient;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setSender(String theSender){
		this.sender = theSender;
	}
	
	public void setRecipient(String theRecipient){
		this.recipient = theRecipient;
	}
	
	public void setTitle(String theTitle){
		this.title = theTitle;
	}
	
	public String toString(){
		return ("Text is " + getText() + "; Email`s sender:" + this.sender + "; Email`s recipient:" + this.recipient + "; Email`s title:" + this.title);
	}
}
