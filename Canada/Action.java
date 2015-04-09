
public class Action extends Movie{
	public Action(){
		super();
	}
	
	public Action(String theRating, int theID, String theTitle){
		super(theRating, theID, theTitle);
	}
	
	public Action(Action other){
		super(other);
	}
	
	@Override public double calcLatefees(int day){
		return 3.0 * day;
	}
}
