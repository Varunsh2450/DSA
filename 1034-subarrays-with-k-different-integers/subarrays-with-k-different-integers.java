class Solution {
    int subarraysWithAtmostDistinct(int[] nums, int k) {
        HashMap<Integer,Integer> sMap = new HashMap<>();
        int low = 0;
        int count = 0;
        for(int high=0;high<nums.length;high++){
            sMap.put(nums[high],sMap.getOrDefault(nums[high],0)+1);
            while(sMap.size()>k){
               int freq = sMap.get(nums[low])-1;
               sMap.put(nums[low],freq);
               if(freq==0){
                sMap.remove(nums[low]);
               }
                low++;
            }
            if(sMap.size()<=k){
                count+=(high-low+1);
            }
        }
      return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
          return subarraysWithAtmostDistinct(nums,k)-subarraysWithAtmostDistinct( nums,k-1);
    }
}