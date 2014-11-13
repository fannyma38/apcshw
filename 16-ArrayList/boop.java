import java.io.*;
import java.util.*;
public class boop {
    public static void NoDup(ArrayList<Integer> m){
	for (int c = 0; c<m.size; c++){
	    int compare = m.get(c);
	    if (compare == m.get(c-1)){
		m.remove(c-1);
	    }
	}
    }



    public static void main(String[] args) {
	ArrayList<Integer> ai;
	ai=new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++) {
	    ai.add(r.nextInt(5));
	}
    }


}
