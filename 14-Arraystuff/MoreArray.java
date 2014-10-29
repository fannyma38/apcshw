public class MoreArray{
    public boolean more14(int[] nums) {
	int ret1=0;
	int ret4=0;
	for (int c =0; c < nums.length;c++){
	    if (nums[c] == 4){
		ret4 +=1;
	    }
	    if (nums[c]==1){
		ret1 +=1;}
	}
	return ret1>ret4;
    }
    


    public int sum67(int[] nums) {
	int ret = 0;
	for (int c = 0; c < nums.length; c++){
	    if (nums[c] != 6){
		ret += nums[c];
	    }
	    if (nums[c] == 6){
		while (nums[c] !=7){
		    c++;
		}
	    }
	}
	return ret;
    }
        

    public int[] tenRun(int[] nums) {
	int c = 0;
	while (c < nums.length){
	    if (nums[c]%10 ==0 && ( c <= (nums.length -2)) )
		if (nums[c+1]%10 > 0){
		    nums[c+1] = nums[c];
		    c++;
		}
	    c++;
	}
	return nums;     
    }
    
public boolean tripleUp(int[] nums) {
  int c =0;
  while (c < nums.length-2){
    int b = nums[c] +1;
    int d = nums[c] + 2;
    if (b == nums[c+1] && d ==nums[c+2]){
    return true;
    } else {
	if (c = nums.length-3){
	    return false;
	}
	c++;
    }
  }
}
    
    public int[] seriesUp(int n) {
	int[] a = new int[n*(n+1)/2];
	for (int c =0; c > a.length; c++){
	    for (int k =1; k < n; k++){
		for (int p = 0; p < k; p++){
		    a[c] = 
			}
	    }
	}
    }


    public boolean canBalance(int[] nums) {
	int half = nums.length / 2
	    for (int c =0; c < half ; c++){
    
    
		for (int k=half; k < (nums.length-1); k++{
  
		    }
	   
			 }
	    }
    }
}
