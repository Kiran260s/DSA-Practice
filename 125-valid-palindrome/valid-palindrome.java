class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder Str = new StringBuilder(); //We use string builder because string is immutable(fixed)
        for(char i: s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                Str.append(Character.toLowerCase(i));
            }
        }
        int l = 0, r = Str.length()-1;
        while(l<r){
            if(Str.charAt(l++) != Str.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}