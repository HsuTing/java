
public class Truck extends Vehicle{
	private double load_capacity;
	private int towing_capacity;
	
	public Truck(){
		super();
		
		this.load_capacity = 0;
		this.towing_capacity = 0;
	}
	
	public Truck(String theManufacturer_name, int theCylinder_engine, Person theOwner, double theLoad_capacity, int theTowing_capacity){
		super(theManufacturer_name, theCylinder_engine, theOwner);
		
		this.load_capacity = theLoad_capacity;
		this.towing_capacity = theTowing_capacity;
	}
	
	public Truck(Truck other){
		super(other.getManufacturer_name(), other.getCylinder_engine(), other.getOwner());
		
		this.load_capacity = other.load_capacity;
		this.towing_capacity = other.towing_capacity;
	}
	
	public void setLoad_capacity(double theLoad_capacity){
		this.load_capacity = theLoad_capacity;
	}
	
	public void setTowing_capacity(int theTowing_capacity){
		this.towing_capacity = theTowing_capacity;
	}
	
	public double getLoad_capacity(){
		return this.load_capacity;
	}
	
	public int getTowing_capacity(){
		return this.towing_capacity;
	}
	
	public String toString(){
		return (getManufacturer_name() + " " + getCylinder_engine() + " " + getOwner().getName() + " " + String.valueOf(this.load_capacity) + " " + String.valueOf(this.towing_capacity));
	}
	
	public boolean equals(Truck other){
		if (other == null)
	        return false;
	    else if (getClass( ) != other.getClass( ))
	        return false;
	    else
	    {
	        return (this.load_capacity == other.load_capacity && this.towing_capacity == other.towing_capacity && getManufacturer_name().equals(other.getManufacturer_name()) && getCylinder_engine() == other.getCylinder_engine() && getOwner().equals(other.getOwner()));
	    }
	}
}
