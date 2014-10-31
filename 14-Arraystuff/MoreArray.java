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
	int[] ans = new int[3];
	if (nums.length==3) {return (nums[0]==nums[1]-1 && nums[0]==nums[2]-2);}
	for (int i = 0; i< nums.length-2;i++) {
	    ans[0] = nums[i];
	    ans[1] = nums[i+1];
	    ans[2] = nums[i+2];
	    if (ans[0]==ans[1]-1 && ans[0]==ans[2]-2) {return true;}
	}
	return false;
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
    /*----------------------------------*/

    public boolean canBalance(int[] nums) {
	int half = nums.length / 2
	    for (int c =0; c < half ; c++){
    
    
	    }public int sumFront(int[] nums , int i) {
	int ans = 0;
	if (i==0) {return nums[i];}
	else{ for (int place = 0 ; place<=i;place++) {
		ans +=nums[place];
	    }
	}
	return ans;
    }
    public int sumBack(int[] nums , int i) {
	int ans = 0;
	if (i == nums.length-1) {return nums[i];}
	else { for (int place = i+1; place<nums.length;place++)
		ans +=nums[place];
	}
	return ans;
    }
   

 public boolean canBalance(int[] nums) {
	if (nums.length==1) {return false;}
	for (int i = 0;i<nums.length;i++) {
	    if (sumFront( nums , i)==sumBack( nums , i)) {
		return true;
	    }
	}
	return false;
    }

    public int freq(int[] nums, int i){
        int ret= 0;
	for (int c = 0; c < nums.length; c++){
	    if (nums[c] == i){
		ret+=1;
	    }
	}
	return ret;
    }
 
}
