class Solution {
    public int longestSubstring(String s, int k) {
         int freq[] = new int[26];
         int maxLen = 0;
         char[] str = s.toCharArray();
         for(char ch:str){
            int index = ch - 'a';
            freq[index]++;
         }
         boolean valid = true;
         int start = 0;
         for(int end = 0;end<s.length();end++){
            if(freq[str[end]-'a']>0 && freq[str[end]-'a']<k){
                String substring = s.substring(start,end);
                maxLen = Math.max(maxLen,longestSubstring(substring,k));
                start = end+1;
                valid = false;
            }
         }
         if(valid){
            return s.length();
         }
         else{
            return Math.max(maxLen,longestSubstring(s.substring(start),k));
         }
    }
}