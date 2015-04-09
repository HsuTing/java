
public class Movie {
	private String rating, title;
	private int ID;
	
	public Movie(){
		this.rating = "";
		this.ID = 0;
		this.title = "";
	}
	
	public Movie(String theRating, int theID, String theTitle){
		this.rating = theRating;
		this.ID = theID;
		this.title = theTitle;
	}
	
	public Movie(Movie other){
		this.rating = other.rating;
		this.ID = other.ID;
		this.title = other.title;
	}
	
	public void setRating(String theRating){
		this.rating = theRating;
	}
	
	public void setID(int theID){
		this.ID = theID;
	}
	
	public void setTitle(String theTitle){
		this.title = theTitle;
	}
	
	public String getRating(){
		return this.rating;
	}
	
	public int getID(){
		return this.ID;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	@Override public boolean equals(Object obj){
		if (obj == null)
	        return false;
	    Movie other = (Movie)obj;
		if(other.ID == this.ID)
			return true;
		else
			return false;
	}
	
	public double calcLatefees(int day){
		return 2.0 * day;
	}

	public static void main(String[] args) {
		Action action = new Action("G", 1, "action");
		System.out.println("creat an action whose Rating is " + action.getRating() + " ,ID is " + action.getID() + " ,title is " + action.getTitle());
		Comedy comedy = new Comedy("PD - 13", 2, "comedy");
		System.out.println("creat a comedy whose Rating is " + comedy.getRating() + " ,ID is " + comedy.getID() + " ,title is " + comedy.getTitle());
		Drama drama = new Drama("R", 1, "drama");
		System.out.println("creat a drama whose Rating is " + drama.getRating() + " ,ID is " + drama.getID() + " ,title is " + drama.getTitle());
		Movie movie = new Movie("R", 1, "drama");
		System.out.println("Creat a movie whose Rating is " + movie.getRating() + " ,ID is " + movie.getID() + " ,title is " + movie.getTitle());
		
		System.out.println("action is equal to comedy? Answer is " + action.equals(comedy));
		System.out.println("action is equal to drama? Answer is " + action.equals(drama));
		System.out.println("If action is late(3 days), the late fee is " + action.calcLatefees(3));
		System.out.println("If comedy is late(2 days), the late fee is " + comedy.calcLatefees(2));
		System.out.println("If drama is late(5 days), the late fee is " + drama.calcLatefees(5));
		System.out.println("If movie is late(1 days), the late fee is " + movie.calcLatefees(1));
	}

}
