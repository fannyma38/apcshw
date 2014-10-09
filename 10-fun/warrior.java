public class Warrior extends Basechar{
    private int healthboost=5;
    public void attack(Basechar other){
	// System.out.println(this.getName()+" is super attacking "+other.getName());
	// toString is automatically called when you put a class instance in a string
	// context
	System.out.println(this+" is super attacking "+other);
	
    }
    
      public int getHealth() {
	  return healthboost + super.getHealth();
    }

}
public class Basechar {
    private int health=20;
    private String name="default name";

    public String toString(){
	return this.getName();
    }
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is attacking "+other.getName());
	// toString is automatically called when you put a class instance in a string
	// context
	System.out.println(this+" is attacking "+other);
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getName(){
	return name;
    }
    public int getHealth() {
	return health;
    }

    public void setHealth(int i){
	health = i;
    }
}
