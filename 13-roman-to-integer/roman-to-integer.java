class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);

        int result = 0;
        for(int i = 0; i<s.length()-1;i++){
            int current = hash.get(s.charAt(i));
            int next = hash.get(s.charAt(i+1));
            if(current < next){
                result = result - current;
            }
            else{
                result = result + current;
            }
        }
        //Add the last character of the string(we can't use s.length in for loop as i+1 is out of bounds)
        result += hash.get(s.charAt(s.length()-1));
        return result;
    }
}