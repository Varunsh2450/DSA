class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> sSet = new HashSet<>();
        int n = candyType.length;
        int ans = 0;
        for(int i=0;i<candyType.length;i++){
            sSet.add(candyType[i]);
        }
        return Math.min(sSet.size(),n/2);
    }  
}