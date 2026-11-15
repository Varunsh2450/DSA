class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sMap = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(sMap.containsKey(num)){
               arr[0] = sMap.get(num);
               arr[1] = i;
            }
            else{
                sMap.put(nums[i],i);
            }
        }
        return arr;
    }
}