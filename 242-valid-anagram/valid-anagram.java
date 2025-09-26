class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap <Character, Integer> map = new HashMap<>();
        
        //Count the frequencies of each alphabet in s
        for(char c: s.toCharArray()){ //s.toCharArray converts string into an Char Array
            map.put(c, map.getOrDefault(c,0) + 1);
            //map.put(key, value) - it assigns a key&value to map
            //map.getOrDefault(key, value) - Returns the value if the key exists or returns default value(here 0) and if its first make count as 1  
        }
        
        //Subtract 1 from frequency of str t
        for(char c: t.toCharArray()) {
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c)-1);
        }

        for(int count: map.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}