import java.io.*;
import java.util.*;

public class Driver2{
    public static void main(String[] args){
	Random rnd = new Random();
	//implement and comparTo were added to abstract Basechar class

	//Array
	Mage[] ma = new Mage[10];
	for(int i =0;i<ma.length;i++){
	    String name = "";
	    name += (char)(48 + rnd.nextInt(47));
	    ma[i] = new Mage();
	    ma[i].setName(name);
	}
	System.out.println(Arrays.toString(ma));
	Arrays.sort(ma);
	System.out.println(Arrays.toString(ma));


	ArrayList<Warrior> names = new ArrayList<Warrior>();
	for(int c =0;c<10;c++){
	    String name = "";
	    name += (char)('A' + rnd.nextInt(26));
	    Warrior name = new Warrior();
	    name.setName(name);
	    names.add(name);
	}
	Collections.sort(names);
	System.out.println(names);
      
    }
}
