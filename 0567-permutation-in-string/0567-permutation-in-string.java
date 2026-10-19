class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> pMap = new HashMap<>();
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char ch = s2.charAt(i);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s1.length();i++){
             char ch = s1.charAt(i);
             pMap.put(ch,pMap.getOrDefault(ch,0)+1);
        }
        if(sMap.equals(pMap)){
            return true;
        }
        int low = 0;
        int high = s1.length()-1;
        while(high<s2.length()-1){
            char left= s2.charAt(low);
            sMap.put(left,sMap.get(left)-1);
            if(sMap.get(left)==0){
                sMap.remove(left);
            }
            low++;
            high++;
            char right = s2.charAt(high);
            sMap.put(right,sMap.getOrDefault(right,0)+1);
         if(sMap.equals(pMap)){
            return true;
        }
        }
        return false;
    }
}