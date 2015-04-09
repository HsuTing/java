import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Doctor extends SalariedEmployee{
	private String specialty;
	private double office_visit_fee;
	
	public Doctor(){
		super ( );
		specialty = "";
		office_visit_fee = 0;
		
	}
	
	public Doctor(String theName, Date theDate, double theSalary, String theSpecialty, double theOffice_visit_fee){
		super(theName, theDate, theSalary);
		
		if (theSpecialty == null || theOffice_visit_fee <= 0)
        {
            System.out.println("Fatal Error.");
            System.exit(0);
        }

		this.specialty = theSpecialty;
		this.office_visit_fee = theOffice_visit_fee;
	}
	
	public Doctor(Doctor originalObject )
    {
         super(originalObject);
         this.specialty = originalObject.specialty;
         this.office_visit_fee = originalObject.office_visit_fee;
    }
	
	public String getSpecialty(){
		return this.specialty;
	}
	
	public double getOffice_visit_fee(){
		return this.office_visit_fee;
	}
	
	public void setSpecialty(String newSpecialty)
    {
         if (newSpecialty != null)
             this.specialty = newSpecialty;
         else
         {
             System.out.println("Fatal Error: Negative Specialty.");
             System.exit(0);
         }
    }
	
	public void setOffice_visit_fee(double newOffice_visit_fee)
    {
         if (newOffice_visit_fee >= 0)
             this.office_visit_fee = newOffice_visit_fee;
         else
         {
             System.out.println("Fatal Error: Negative Office visit fee.");
             System.exit(0);
         }
    }
	
	public String toString( )
    {
        return (getSpecialty() + " " + getOffice_visit_fee() + " " +getName( ) + " " + getHireDate( ).toString( ) + "\n$" + getSalary() + " per year");
    }

    public boolean equals(Doctor other)
    {
        return (getName( ).equals(other.getName( )) && getHireDate( ).equals(other.getHireDate( )) && getSalary( ) == other.getSalary( ) && specialty.equals(other.specialty) && office_visit_fee == other.office_visit_fee );
    }
	
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date_A;
		try {
			date_A = dateFormat.parse("2005/12/25");
			Date date_B = dateFormat.parse("2014/12/25");
			Doctor a = new Doctor("test_A", date_A, 100.0, "Pediatrician", 50.0);
			Doctor b = new Doctor("test_B", date_B, 80.0, "Obstetrician", 30.0);
			System.out.println("a`s toString():");
			System.out.println(a.toString());
			System.out.println("b`s toString():");
			System.out.println(b.toString());
			System.out.println("let c equal to a:");
			Doctor c = new Doctor(a);
			System.out.println(a.toString());
			System.out.println("Compare a and b");
			System.out.println(a.equals(b));
			System.out.println("Compare a and c");
			System.out.println(a.equals(c));
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}

}