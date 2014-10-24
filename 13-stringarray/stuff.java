public class Stuff{
    public int[] frontPiece(int[] nums) {
  if (nums.length < 2){
   return nums;
   }
   else{
   int[] ret = new int[2];
   ret[0] = nums[0];
   ret[1] = nums[1];
   return ret;
   }
}

  public int sum13(int[] nums) {
  int ret = 0;
  for (int c = 0; c < nums.length; c++){
      if (nums[c] < 13){
         ret = ret + nums[c];
         } else {
         c = c+1;
         }
         }
         return ret;
         }
}
