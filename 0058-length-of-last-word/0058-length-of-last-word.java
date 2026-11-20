class Solution {
    public int lengthOfLastWord(String s) {
        String freq[] = s.split(" ");
        String item = freq[freq.length-1];
        return item.length();
    }
}