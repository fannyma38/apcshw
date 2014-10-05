public class frame{
    public String stringify(String x, int n){
	String ret = "";
	for (n=n;n>0; n--){
	    ret = ret + x;
	}
	return ret;
    }


    public String framego(int h, int v){
	String ret = "";
	ret = ret + stringify("*",h);
        for (int c=0;c<v-2;c++){
	   ret = ret + "\n*" + stringify(" ", h-2)+"*";
	}
	ret = ret + "\n" + stringify("*",h);
	return ret;
   }


    public String stringSplosion(String str) {
	String ret = "";
	int L = str.length();
	for (int c = 0; c < L+1; c++){
	    ret = ret + str.substring(0,c);
	}
	return ret;
    }

    public String stringX(String str) {
	String ret = "";
	int L = str.length();
	for (int c = 0; c<L; c++){
	    String p = str.substring(c, c+1);
	    if (p.equals("x") && ((c ==0) || (c == L-1))){
		ret = ret + "x";
	    }
	    if (!p.equals("x")){
		ret = ret + p;
	    }
	}
	return ret;    
    }




}


	    
	    
	    

