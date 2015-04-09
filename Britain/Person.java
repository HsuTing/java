import java.lang.String;;

public class Person {
	private String name;
    public Person(){
    	this.name = "";
    }
    
    public Person(String theName){
    	this.name = theName;
    }
    
    public Person(Person theObject){
    	this.name = theObject.name;
    }
    
    public String getName(){
    	return this.name;
    }
    
    public void setName(String theName){
    	this.name = theName;
    }
    
    public String toString(){
    	return (this.name);
    }
    
    public boolean equals(Person other){
	    if (other == null)
	        return false;
	    else if (getClass( ) != other.getClass( ))
	        return false;
	    else
	    {
	        return (this.name.equals(other.getName()));
	    }
    }
}