public class OSA extends Sarray{
	String[] data;//the larger array aka the entire data
    int last;// will at most be the length of data set

    public Sarray() {
        	// set up the initial instance variables
	data = new String[16];
	// Set default value to 0
	for (int i = 0; i < data.length; i++){
		data[i] = " ";
	}
	last = 0;
    	}
    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    
	    s = s + data[i] +" ";
	    
	    //s = s + "\n";
	}
	return s;
    }
    public boolean add(String i){
        	// adds an item to the end of the list, grow if needed
        	// returns true
		try {
			if (size() == data.length){
			    String[] buffer = new String[data.length + 1];//buffer is essentially the new data
				for (int n = 0; n < data.length; n++){
					buffer[n] = data[n];
				}
				buffer[data.length] = i;
				data = buffer;
				last++;
			}
			else {
				data[last] = i;
				last++;
			}
			return true;
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
    	}

    	public void add(int index, String k){
        	// adds item i  at index, shifting everything down as needed.
        	// also grows as needed 
		if (last < index) {last = index - 1;} //Grow!
		String[] buffer = new String[last + 1]; 
		try{
			for (int i = 0; i < buffer.length; i++){
				if (i < index){
					buffer[i] = data[i];
				}
				else if (i == index){
					buffer[i] = k;
				}
				else {
					buffer[i] = data[i - 1];
				}
			}
			data = buffer;
			last++;
		} catch(Exception e){e.printStackTrace();}

    	}

    	public int size() {
        	// returns the number of items in the list (not the array size)
		return last;
    	}

    	public String get(int index) {
        	// returns the item at location index of the list
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");
	        return "out of bounds";

		}
	}
    
    	public String set(int index, String s){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		String buffer=data[index];
        		data[index] = s;
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}//the error message
        	return "SOS";
        	
    	}

    	public String remove(int index){
        	// removes the item at index i
        	// returns the old value
	    String[] buffer = new String[size()];//changed size
		String toReturn="";
		for (int i = 0; i < buffer.length; i++){
			if (i < index){
                        	buffer[i] = data[i];
                        }
                        else if (i == index) {
                                //buffer[i] = obj;
                                toReturn = buffer[i];
                        }
                        else {
			    try{
				buffer[i] = data[i + 1];}
			    catch(Exception e){buffer[i]="";}
			}
                }
		last--;
		data = buffer;
		return toReturn;
    	}
	    

    public void iSort() {
	String[] ret = new String[size()];
	int i = 0;
	int a =size();
	while (i<a) {
	    for (int c = 0;c<data[i+1].length();c++) {
		if (data[i+1].substring(i,i+1).compareTo(data[i].substring(i,i+1)) <1){
		    String t = data[i+1];
		}
		else if (data[i+1].substring(i,i+1).compareTo(data[i].substring(i,i+1)) >1){
		    String t = data[i]}
		c++;
	    }
	    data = ret;
	}
	//I feel like the insertion method would be a better because it does not grow exponentially like the selection sort method does. Bubblesort as well
	// appears to me as an exponential method. It is quite similat to the selection sort. So, that leaves the insertion method as the best method.
	public void iSelect(){
	    String[] ret = new String[size()];
	    int i = 0;
	    int small=0;
	    int a =size();
	    for (i =0; i< a; i++){
		small=data[i];
		for (int j=0; j<a; j++){
		    if (data[j] < data[small]){
			small = j;
		    }
		}
		if (i != small){
		    int k = data[i];
		    data[i] = data[small];
		    items[small] = k;
		}
	    }
	}


	public void ibub(){
	    int a = size();
	    int finish;
	    for (int i = 0; i < a; i++){
		for (int j=0, finish = a-1; j< finish; j++){
		    if (data[j] > data[j+1]){
			int k = data[j];
			data[j] = data[j+1];
			data[j+1] = k;
		    }
		}
	    }
	}
	//The bubble sort method is the most inefficient method of them all
	//It takes the most time.
	    

	public static void main(String[] args){
	    Sarray k = new Sarray();
	}




}
