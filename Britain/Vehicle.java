
public class Vehicle {
	private String manufacturer_nmae;
	private int cylinder_engine;
	private Person owner;
	
	public Vehicle(){
		this.manufacturer_nmae = "";
		this.cylinder_engine = 0;
		this.owner = null;
	}
	
	public Vehicle(String theManufacturer_name, int theCylinder_engine, Person theOwner){
		this.manufacturer_nmae = theManufacturer_name;
		this.cylinder_engine = theCylinder_engine;
		this.owner = theOwner;
	}
	
	public Vehicle(Vehicle other){
		this.manufacturer_nmae = other.manufacturer_nmae;
		this.cylinder_engine = other.cylinder_engine;
		this.owner = other.owner;
	}
	
	public void setManufacturer_name(String theManufacturer_name){
		this.manufacturer_nmae = theManufacturer_name;
	}
	
	public void setCylinder_engine(int theCylinder_engine){
		this.cylinder_engine = theCylinder_engine;
	}
	
	public void setOwner(Person theOwner){
		this.owner = theOwner;
	}
	
	public String getManufacturer_name(){
		return this.manufacturer_nmae;
	}
	
	public int getCylinder_engine(){
		return this.cylinder_engine;
	}
	
	public Person getOwner(){
		return this.owner;
	}
	
	public String toString(){
		return (this.manufacturer_nmae + " " + String.valueOf(this.cylinder_engine) + " " + owner.toString());
	}
	
	public boolean equals(Vehicle other){
		if (other == null)
	        return false;
	    else if (getClass( ) != other.getClass( ))
	        return false;
	    else
	    {
	        return (this.manufacturer_nmae.equals(other.getManufacturer_name()) && this.cylinder_engine == other.getCylinder_engine() && this.owner.equals(other.owner));
	    }
	}
	
	public static void main(String[] args) {
		Person temp_A = new Person("Vehicle_A");
		Person temp_B = new Person("Vehicle_B");
		Vehicle Vehicle_A = new Vehicle("Vehicle_A", 10 , temp_A);
		Vehicle Vehicle_B = new Vehicle("Vehicle_B", 5 , temp_B);
		Vehicle Vehicle_C = new Vehicle(Vehicle_A);
		
		System.out.println("Vehicle_A.toString():");
		System.out.println(Vehicle_A.toString());
		System.out.println("Vehicle_B.toString():");
		System.out.println(Vehicle_B.toString());
		System.out.println("Vehicle_C.toString():");
		System.out.println(Vehicle_C.toString());
		System.out.println("Vehicle_A.equals(Vehicle_B)");
		System.out.println(Vehicle_A.equals(Vehicle_B));
		System.out.println("Vehicle_A.equals(Vehicle_C)");
		System.out.println(Vehicle_A.equals(Vehicle_C));
		
		System.out.println();
		
		Truck Truck_A = new Truck("Truck_A", 10 , temp_A, 0, 0);
		Truck Truck_B = new Truck("Truck_B", 5 , temp_B, 10, 5);
		Truck Truck_C = new Truck(Truck_A);
		
		System.out.println("Truck_A.toString():");
		System.out.println(Truck_A.toString());
		System.out.println("Truck_B.toString():");
		System.out.println(Truck_B.toString());
		System.out.println("Truck_C.toString():");
		System.out.println(Truck_C.toString());
		System.out.println("Truck_A.equals(Truck_B)");
		System.out.println(Truck_A.equals(Truck_B));
		System.out.println("Truck_A.equals(Truck_C)");
		System.out.println(Truck_A.equals(Truck_C));
	}

}
