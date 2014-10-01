public class Driver{
    public static void main(String[]args){

	/*10min*/
	public String frontTimes(String str, int n) {
	    int x = str.length();
	    String rep = "";
	    if (x < 3){
		rep = rep + str;
	    } else {
		rep = str.substring(0,3);
	    }
	    int c = 0;
	    String ret = "";
	    while (n>c){
		ret = ret + rep;
		c = c + 1;
	    }
	    return ret;
	}

	/*20min*/    
	public String stringBits(String str) {
	    int l = str.length();
	    String ret = "";
	    String cut = "";
	    int c = 0;
	    while (c < l){
		cut = str.substring(c,c+1);
		ret = ret + cut;
		c= c + 2;
	    }
	    return ret;
	}

	/*50min*/
	public String stringYak(String str) {
	    int x = str.length();
	    int c = 0;
	    String ret = "";
	    while (c <= x-3){
		if ((c != x -2 ) && (c != x-1)){
		    String ch = str.substring(c,c+3);
		    if (ch.equals("yak")){
			c = c + 3;
		    }
		    else {ret = ret + str.substring(c,c+1);
			c = c + 1;}}}
  
	    if ((c == x-3)&&(!(str.substring(c)).equals("yak")))
		ret = ret + str.substring(c);
    
	    return ret;
	}

	/*10 min*/
	public int stringMatch(String a, String b) {
	    int c = 0;
	    int ret = 0;
	    int lb = b.length();
	    int la = a.length();
	    while ((c < la-1) && (c < lb-1)){
		String na = a.substring(c,c+2);
		String nb = b.substring(c,c+2);
		if (na.equals(nb)){
		    ret = ret + 1; }
		c = c+1;}
	    return ret;
	}
    }}
