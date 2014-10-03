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
    /* public String tri2(int r){
	String ret= "";
	for (int c = 1; c<r+1; c=c+1){
	    for (s = r -c;s > 0; s=s-1){
		ret = ret + " ";
	    }
	    for (int p = c;p > 0; p = p-1){
		ret = ret + "*";
	    }
	    ret = ret + "\n";
	}
	return ret;
    }
    */





    public String tri3(int r) {
	String ret = "";
	int c = 1;
	while (c < r+1){
	    int star = (c * 2) - 1;
	    int spa = (( ((r*2)-1)- star) /2);
	    while (spa > 0){
		ret = ret + " ";
		spa = spa - 1;
	    }
	    while (star> 0){
		ret = ret + "*";
		star = star -1;
	    }
	    int spa2 = (( ((r*2)-1)- star) /2);
	    while (spa2 > 0){
		ret = ret + " ";
		spa2 = spa2 - 1;
	    }
	    ret = ret + "\n";
	    c = c + 1;
	}
	return ret;
    }
    /*  public String tri3(int r) {
	String ret = "";
	for (int c=1;c < r+1; c=c+1){
	    int star = (c * 2) - 1;
	    for (int spa=((((r*2)-1)-star)/2);spa > 0; spa = spa-1){
		ret = ret + " ";
	    }
	    for (star;star> 0;star= star-1){
		ret = ret + "*";
	    }
	    int spa2 = (( ((r*2)-1)- star) /2);
	    for(int spa2=((((r*2)-1)-star)/2);spa2 > 0;spa2=spa2-1){
		ret = ret + " ";
	    }
	    ret = ret + "\n";
	}
	return ret;
    }


*/


    public String diamond(int r){
	String ret ="";
	int midr = (r /2)+1;
	ret = tri3(midr);
	int c = 1;
	int rc = r - midr;
	while (c< rc+1){
	    int star = r- (c*2);
	    int spac = ((r - star)/2);
	    while (spac > 0){
		ret = ret + " ";
		spac = spac - 1;
	    }
	    while (star >0){
		ret = ret + "*";
		star = star -1;
	    }
	    int spac2= ((r- star)/2);
	    while (spac2 > 0){
		ret = ret + " ";
		spac2 = spac2 - 1;
	    }
	    ret = ret + "\n";
	    c = c+1;
	}
	return ret;
    }
    /*
    public String diamond(int r){
	String ret ="";
	int midr = (r /2)+1;
	ret = tri3(midr);
	int rc = r - midr;
	for (int c=1;c< rc+1; c=c+1){
	    int star = r- (c*2);
	    for (int spac = ((r-star)/2) spac > 0;spac=spac-1){
		ret = ret + " ";
	    }
	    for(star;star >0;star=star-1){
		ret = ret + "*";
	    }
	    for (int spac2 = ((r-star)/2);spac2 > 0;ret = spac2 = spac2-1){
		ret = ret + " ";
	    }
	    ret = ret + "\n";
	}
	return ret;
    }

     */






    public String tri4(int r){
	String ret = "";
	int c = 1;
	while (c< r+1){
	    int star = (r - c)+1;
	    int spac = r-star;
	    while (spac > 0){
		ret = ret + " ";
		spac = spac - 1;
	    }
	    while (star > 0){
		ret = ret + "*";
		star = star -1;
	    }
	    ret = ret + "\n";
	    c = c + 1;
	}
	return ret;
    }
	
    /*
    public String tri4(int r){
	String ret = "";
	for (c=1;c< r+1;c=c+1){
	    int star = (r - c)+1;
	    for (spac = r-star;spac > 0;spac = spac-1){
		ret = ret + " ";
	    }
	    for (star;star > 0;star=star-1){
		ret = ret + "*";
	    }
	    ret = ret + "\n";
	}
	return ret;
    }

*/
		       	

}
	    
	       
	
	 
	
         

	    
	    
	    
	    
	
	
