public class Sarray {
    int[] data;
    int   last;

    public Sarray() {
        int[] ret;
	data = new int[10]
    }

    public boolean add(int i){
	ret = new int[data.length+1];
	for (int c=0;c>data.length;c++){
	    ret[c] = data[c];
		}
	ret[data.length] = i;
	return true;
        // adds an item to the end of the list, grow if needed
        // returns true
    }

    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
	ret = new int[data.length+1];
	booleon found = false;
	for (int c =0; c< data.length && found== false; c++){
	    if (c == index){
		ret[index] = i;
		for (int k = c +1 ; k < ret.length; k++){
		    ret[k] = data[c];
		    c++;}
		found = true;
	    }else{
		ret[c] = data[c];}
	}
    
	    	    	       	      
		
    }

    public int size() {
        return ret.length -1;
// returns the number of items in the list (not the array size)
    }

    public int get(int index) {
        // returns the item at location index of the lsit
	return ret[index];
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
	ret[index] = p;
	ret[index] = i;
	return p;
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
	int k = 0;
	for (int c=0; c< ret.length; c++ ){
	    if (c = index){
		c++;}
	    else{
		ret[k] = ret[c];
		k++;
    
	    }
	}
    }
}
