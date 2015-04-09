
public class Alien {
	private int health;
	private String name;
	private int totalDamage = 0;
	
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
	
	public void calculateDamage(SNAKE_ALIEN other){
		totalDamage = totalDamage + other.getDamage();
	}
	
	public void calculateDamage(OGRE_ALIEN other){
		totalDamage = totalDamage + other.getDamage();
	}
	
	public void calculateDamage(MARSHMALLOW_MAN_ALIEN other){
		totalDamage = totalDamage + other.getDamage();
	}
	
	public int getTotalDamage(){
		return this.totalDamage;
	}

	public static void main(String[] args) {
		Alien Total = new Alien(100, "Total");
		
		System.out.printf("Total Damage: ");
		System.out.println(Total.getTotalDamage());
		
		System.out.println("Add a SNAKE_ALIEN");
		SNAKE_ALIEN snake_alien = new SNAKE_ALIEN(100, "SNAKE_ALIEN");
		System.out.printf("Total Damage: ");
		Total.calculateDamage(snake_alien);
		System.out.println(Total.getTotalDamage());
		
		System.out.println("Add a OGRE_ALIEN");
		OGRE_ALIEN ogre_alien = new OGRE_ALIEN(100, "OGRE_ALIEN");
		System.out.printf("Total Damage: ");
		Total.calculateDamage(ogre_alien);
		System.out.println(Total.getTotalDamage());
		
		System.out.println("Add a MARSHMALLOW_MAN_ALIEN");
		MARSHMALLOW_MAN_ALIEN marshmallow_man_alien = new MARSHMALLOW_MAN_ALIEN(100, "MARSHMALLOW_MAN_ALIEN");
		System.out.printf("Total Damage: ");
		Total.calculateDamage(marshmallow_man_alien);
		System.out.println(Total.getTotalDamage());
	}

}
