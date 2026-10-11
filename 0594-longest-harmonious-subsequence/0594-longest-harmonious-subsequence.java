class Solution {
    public int findLHS(int[] nums) {
        int len = 0;
        int maxlen = 0;
        HashMap<Integer,Integer> sMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sMap.put(nums[i],sMap.getOrDefault(nums[i],0)+1);
        }
        for(int x:sMap.keySet()){
            if(sMap.containsKey(x+1)){
                len = sMap.get(x)+sMap.get(x+1);
                maxlen = Math.max(maxlen,len);
            }
        }
        return maxlen;
    }

}