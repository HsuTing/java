
abstract public class Alien {
	private int health;
	private String name;
	protected static int totalDamage = 0;
	
	public Alien(){
		this.health = 0;
		this.name = "";
	}
	
	public Alien(int theHealth, String theName){
		this.health = theHealth;
		this.name = theName;
	}
	
	public Alien(Alien other){
		this.health = other.health;
		this.name = other.name;
	}
	
	public void setHealth(int theHealth){
		this.health = theHealth;
	}
	
	public void setName(String theName){
		this.name = theName;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public String getName(){
		return this.name;
	}
	
	abstract public int getDamage();
	abstract public void addDamage();

}
