class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> sSet = new HashSet<>();
        int n = candyType.length;
        int na = n/2;
        int ans = 0;
        for(int i=0;i<candyType.length;i++){
            sSet.add(candyType[i]);
        }
        if(sSet.size()<n/2){
            return sSet.size();
        }
        if(sSet.size()==1){
            return sSet.size();
        }
        if(na!=sSet.size()){
             ans = na;
        }
        else{
            ans = sSet.size();
        }
       return ans;
    }  
}