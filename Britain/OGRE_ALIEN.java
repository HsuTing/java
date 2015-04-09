
public class OGRE_ALIEN extends Alien{
	private int damage = 6;

	public OGRE_ALIEN(){
		super(0,"");
	}
	
	public OGRE_ALIEN(int theHealth, String theName){
		super(theHealth, theName);
	}
	
	public OGRE_ALIEN(SNAKE_ALIEN other){
		super(other.getHealth(), other.getName());
	}
	
	public int getDamage(){
		return this.damage;
	}
}
