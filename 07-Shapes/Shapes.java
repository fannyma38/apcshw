public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    

    public String tri1(int r){
	String ret ="";
	int c = 1;
	while (c<r+1){
	    int oc = c;
		while ( oc> 0){
		    ret = ret + "*";
		    oc = oc - 1;
		}
	    ret = ret + "\n";
	    c = c +1;
	}
	return ret;
    }

    public String tri2(int r){
	String ret= "";
	int c = 1;
	while (c<r+1){
	    int s = r - c;
	    while (s > 0){
		ret = ret + " ";
		s = s - 1;
	    }
	    int p = c;
	    while(p > 0){
		ret = ret + "*";
		p = p - 1;
	    }
	    ret = ret + "\n";
	    c = c+1;
	}
	return ret;
    }
	      

}

