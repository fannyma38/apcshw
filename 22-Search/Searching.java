import java.io.*;
import java.util.*;


public class Searching{


    public Comparable[] a;
    public Searching(int x){
	a = new Comparable[x];
    }
    


    public String toString(){
	String s = ("");
	for(int i = 0; i <a.length;i++){
	    s +=a[i];
	}
	return s + "\n";
    }



    public void addition(int i, Comparable ret){
	a[i] = ret;
    }
    
    public void sorting(){
	Arrays.sorting(a);
    }

    public Comparable lsearch(Comparable ret){
	for(int i = 0;i<a.length;i++){
	    if (a[i].equals(ret)){
		return a[i];
	    }
	}
	return null;
    }


    public Comparable bsearch(Comparable ret){
	int hi = a.length - 1;
	int lo = 0;
	int mi = (hi +lo)/2;
	while (hi > lo){
	    int com = a[mi].compareTo(ret);
	    if (com > 0){
		hi = mi -1;
	    } else {
		lo = mi + 1;
	    }
	}
	return null;
    }



    public Comparable rbsearch(Comparable ret,int hi, int lo){
	int mi = (hi +lo)/2;
	if (hi > lo){
	    return null;
	}
	int mi = (hi +lo)/2;
	int compare = a[mi].compareTo(item);
	if (ret[mi].equals(ret)) {
	    return ret;
	} else {
	    if (c.compareTo(ret[mi]) > 0) {
	    }
    }

	
    public static void main(String[] args){
	Random rnd = new Random();
	Searching q= new Searching(5);
    }
}
