
public class MARSHMALLOW_MAN_ALIEN extends Alien{
	private int damage = 1;

	public MARSHMALLOW_MAN_ALIEN(){
		super(0,"");
	}
	
	public MARSHMALLOW_MAN_ALIEN(int theHealth, String theName){
		super(theHealth, theName);
	}
	
	public MARSHMALLOW_MAN_ALIEN(SNAKE_ALIEN other){
		super(other.getHealth(), other.getName());
	}
	
	public int getDamage(){
		return this.damage;
	}
}
