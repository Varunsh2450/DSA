class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int high=k-1;
        int min = Integer.MAX_VALUE;
        if(k==0){
            return 0;
        }
        while(high<nums.length){
           int diff = nums[high] - nums[low];
           min = Math.min(min,diff);
           low++;
           high++;
        }
        return min;
    }
}