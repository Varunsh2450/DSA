class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0,res=0;
        HashMap<Character,Integer> sMap = new HashMap<>();
        for(int high=0;high<s.length();high++){
             char ch = s.charAt(high);
             sMap.put(ch,sMap.getOrDefault(ch,0)+1);
             while(sMap.get(ch)>1){
                char left = s.charAt(low);
                sMap.put(left,sMap.get(left)-1);
                if(sMap.get(left)==0){
                    sMap.remove(left);
                }
                low++;
             }
            res = Math.max(res,high-low+1);
        }
        return res == Integer.MAX_VALUE?0:res;
    }
}