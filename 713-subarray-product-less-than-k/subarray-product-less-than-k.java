class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int low = 0;
         int count=0;
         int prod = 1;
         for(int high=0;high<nums.length;high++){
              prod = prod*nums[high];
             while(prod>k){
                prod = prod / nums[low];
                low++;
             }
               if(prod<k){
                count+=(high-low+1);
             }
         }
         return count;
    }
}