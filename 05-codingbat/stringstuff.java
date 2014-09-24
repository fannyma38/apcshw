public class StringStuff {
    public String nonStart(String a, String b) {
	String newa = a.substring(1);
	String newb = b.substring(1);
	String newab = newa + newb;
	return newab;
    }

    public String makeAbba(String a, String b) {
	String wow = a + b + b + a;
	return wow;
    }

    public int diff21(int n) {
	if (n <= 21)
	    {return 21 - n;
	    } else {
	    return (n-21)*2;
	}
    }
}
