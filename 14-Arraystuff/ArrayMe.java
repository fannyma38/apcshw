public class ArrayMe{
    public int[] seriesUp(int n) {
	int[] ret = new int[n*(n+1)/2];
	for (int c=0;c<ret.length;c++){
	    for (int a=1; a < n+1; a++){
		ret[c]= 1;
		int p = a;
		int e = 1;
      
		while (p > 0){
		    ret[c] = e;
		    e= e+1;
		    p= p-1;
		    c++;
		}
	    }
        }
	return ret;      
                  
    }

    public int[] toFlip(int[] a) {
	int[] b = new int[a.length];
	int k = a.length;
	for (int c = 0; c < a.length; c++){
	    b[c] = a[k-1];
	    k--;
	}
	return b;
    }

    public int maxMirror(int[] nums) {
	int s = nums.length;
	for (s=s; s > 0; s--){
	    int[] a = new int [s]
		int k = 0
		for (int c = 0; c < nums.length; c++){
		    b[c] = nums[k];
		    k++
		}

	}
    }
}

