class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
"..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            String transform = "";
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                int index = ch - 'a';
                transform += morse[index];
            }
            set.add(transform);
        }
        return set.size();
    }
}