class Solution {
    int maxSum(int[] nums){
        int bestend = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = nums[i] + bestend;
            bestend = Math.max(v1,v2);
            sum = Math.max(sum,bestend);
        }
        return sum;
    }
     int minSum(int[] nums){
        int bestend = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
              int v2 = nums[i] + bestend;
            bestend = Math.min(v1,v2);
            sum = Math.min(sum,bestend);
        }
        return sum;
    }
   
    public int maxAbsoluteSum(int[] nums) {
        int ans1 = Math.abs(maxSum(nums));
        int ans2 = Math.abs(minSum(nums));
        return Math.max(ans1,ans2);
    }
}