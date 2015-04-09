
public class SNAKE_ALIEN extends Alien{
	private int damage = 10;

	public SNAKE_ALIEN(){
		super(0,"");
	}
	
	public SNAKE_ALIEN(int theHealth, String theName){
		super(theHealth, theName);
	}
	
	public SNAKE_ALIEN(SNAKE_ALIEN other){
		super(other.getHealth(), other.getName());
	}
	
	public void addDamage(){
		totalDamage = totalDamage + this.damage;
	}
	
	public int getDamage(){
		return totalDamage;
	}
}
