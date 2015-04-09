
public class Comedy extends Movie{
	public Comedy(){
		super();
	}
	
	public Comedy(String theRating, int theID, String theTitle){
		super(theRating, theID, theTitle);
	}
	
	public Comedy(Comedy other){
		super(other);
	}
	
	@Override public double calcLatefees(int day){
		return 2.5 * day;
	}
}
