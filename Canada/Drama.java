
public class Drama extends Movie{
	public Drama(){
		super();
	}
	
	public Drama(String theRating, int theID, String theTitle){
		super(theRating, theID, theTitle);
	}
	
	public Drama(Drama other){
		super(other);
	}
	
	@Override public double calcLatefees(int day){
		return 2.0 * day;
	}
}
