
public class circle {
	private double radius = 0.0f;
	private double pi = 3.141596f;
	
	public circle(){
		this.radius = 0.0f;
	}
	
	public circle(String input){
		this.radius = Integer.parseInt(input);	
	}
	
	public double getDiameter(){
		return 2 * this.radius;
	}
	
	public double getCircmference(){
		return 2 * this.pi * this.radius;
	}
	
	public double getArea(){
		return this.radius * this.radius * this.pi;
	}
	
	public String toString(){
		return String.valueOf(this.radius);
	}
	
	public boolean equals(circle a){
		if(this.radius == a.radius)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		circle a = new circle(args[0]);
		circle b = new circle(args[1]);
		
		System.out.println("Diameter:" + a.getDiameter());
		System.out.println("Circmference:" + a.getCircmference());
		System.out.println("Area:" + a.getArea());
		System.out.println("toString:" + a.toString());
		System.out.println("equals?" + a.equals(b));
	}

}
