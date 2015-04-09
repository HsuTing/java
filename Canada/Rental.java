import java.util.Scanner;


public class Rental extends Movie{
	private int ID_rantal, late_day;
	private Movie rental_movie;
	
	public Rental(){
		super();
		this.ID_rantal = 0;
		this.late_day = 0;
		this.rental_movie = null;
	}
	
	public Rental(String theRating, int ID_rantal, String theTitle){
		super(theRating, ID_rantal, theTitle);
		this.late_day = 0;
		this.rental_movie = null;
	}
	
	public Rental(Rental other){
		super(other);
		this.late_day = 0;
		this.rental_movie = null;
	}
	
	public void setLateFees(Movie temp){
		this.ID_rantal = temp.getID();
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("input late day:");
		this.late_day = keyboard.nextInt();
		this.rental_movie = temp;
		keyboard.close();
	}
	
	public double CalcLateFees(){
		return this.rental_movie.calcLatefees(this.late_day);
	}
	
	public double lateFeesOwed(Rental[] other){
		double Total = 0;
		
		for(int i = 0; i < other.length; i++){
			Total = Total + other[i].CalcLateFees();
		}
		
		return Total;
	}

	public static void main(String[] args) {
		Action action = new Action("G", 1, "action");
		System.out.println("Rent an action whose Rating is " + action.getRating() + " ,ID is " + action.getID() + " ,title is " + action.getTitle());
		Comedy comedy = new Comedy("PD - 13", 2, "comedy");
		System.out.println("Rent a comedy whose Rating is " + comedy.getRating() + " ,ID is " + comedy.getID() + " ,title is " + comedy.getTitle());
		Drama drama = new Drama("R", 1, "drama");
		System.out.println("Rent a drama whose Rating is " + drama.getRating() + " ,ID is " + drama.getID() + " ,title is " + drama.getTitle());
		Movie movie = new Movie("R", 1, "movie");
		System.out.println("Rent a movie whose Rating is " + movie.getRating() + " ,ID is " + movie.getID() + " ,title is " + movie.getTitle());
		
		Rental[] a = new Rental[4] ;
		for(int i = 0; i < a.length; i++)
			a[i] = new Rental();
		System.out.println("Record an action`s late day:");
		a[0].setLateFees(action);
		System.out.println("Late fee:" + a[0].CalcLateFees());
		System.out.println("Record a comedy`s late day:");
		a[1].setLateFees(comedy);
		System.out.println("Late fee:" + a[1].CalcLateFees());
		System.out.println("Record a drama`s late day:");
		a[2].setLateFees(drama);
		System.out.println("Late fee:" + a[2].CalcLateFees());
		System.out.println("Record a movie`s late day:");
		a[3].setLateFees(drama);
		System.out.println("Late fee:" + a[3].CalcLateFees());
		
		Rental total = new Rental();
		System.out.println("Total amount of late fees: " + total.lateFeesOwed(a));
	}

}
