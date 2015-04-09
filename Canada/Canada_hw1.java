
public class Canada_hw1 {

	public static void main(String[] args) {				
		System.out.println("Add a SNAKE_ALIEN");
		SNAKE_ALIEN snake_alien = new SNAKE_ALIEN(100, "SNAKE_ALIEN");
		snake_alien.addDamage();
		System.out.printf("Total Damage: ");
		System.out.println(snake_alien.getDamage());
		
		System.out.println("Add a OGRE_ALIEN");
		OGRE_ALIEN ogre_alien = new OGRE_ALIEN(100, "OGRE_ALIEN");
		ogre_alien.addDamage();
		System.out.printf("Total Damage: ");
		System.out.println(ogre_alien.getDamage());
		
		System.out.println("Add a MARSHMALLOW_MAN_ALIEN");
		MARSHMALLOW_MAN_ALIEN marshmallow_man_alien = new MARSHMALLOW_MAN_ALIEN(100, "MARSHMALLOW_MAN_ALIEN");
		marshmallow_man_alien.addDamage();
		System.out.printf("Total Damage: ");
		System.out.println(marshmallow_man_alien.getDamage());

	}

}
