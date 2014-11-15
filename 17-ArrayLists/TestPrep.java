import java.io.*;
import java.util.*;

public class TestPrep {
    ////araylist
    Random r = new Random();
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    public void create1(int  n) {
	for (int i = 0; i < n+1; i++) {
	    a1.add(i);
	}
    }
    public void randomize1() {
	ArrayList<Integer> ans  = new ArrayList<Integer>();
	ArrayList<Integer> copy = a1;
	int times = a1.size();
	int randIndex;
	while (times > 0){
	    randIndex = r.nextInt(copy.size());
	    ans.add(copy.get(randIndex));
	    times--;
	    copy.remove(randIndex);
	}
	a1 = ans;
    }

    //array
    Random r = new Random();
    public void create2 (int n){
	int[] a2 = new int[n+1]();
	for (int c = 0; c < n+1; c++){
	    a2[c] = c;
	}
    }

    public void randomize2(){
	int[] ret = new ret[a2.length];
	for (int c =0; c < a2.length; c++){
	    int ah = r.nextInt(a2.length);
	    if (a2[ah]==-1){
		ah = r.nextInt(a2.length);}
	    else{
	    ret[c] = r;
	    a2[ah] = -1;
	    }
	}
    }
}
