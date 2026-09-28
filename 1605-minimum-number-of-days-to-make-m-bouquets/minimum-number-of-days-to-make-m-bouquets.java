class Solution {
    public int[] ismax(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int value:bloomDay){
            max = Math.max(value,max);
            min = Math.min(value,min);
        }
        return new int[]{min,max};
    }
    public boolean isPossible(int midDay,int k,int m,int bloomDay[]){
        int count =0;
        int total = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=midDay){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                total++;
                count=0;
            }
            if(total>=m){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
       int[] range = ismax(bloomDay);
       int low = range[0];
       int high = range[1];
       int ans = 0;
       while(low<=high){
         int mid = low + ((high-low)/2);
         if(isPossible(mid,k,m,bloomDay)){
            ans = mid;
            high = mid-1;
         }
         else{
            low = mid+1;
         }
       }
       return ans;
    }
}