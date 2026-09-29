class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> sMap = new HashMap<>();
    
        for(int i=0;i<nums.length;i++){
            if(sMap.containsKey(nums[i])){
               int prev = sMap.get(nums[i]);
                if(i-prev<=k)
                   return true;
            }
            sMap.put(nums[i],i);
        }  
       return false;
    }
}