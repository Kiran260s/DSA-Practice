class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length()-needle.length()+1; i++){ //sadbutsad - 9 char, needle - 3 char we cannot find sad after index 7
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, needle.length() + i).equals(needle)){ //suppose but occurs at index 3 so we see if ut withing the next chars of needle len 
                //In substring method Starting index is inclusive but the end index is exclusive
                    return i;
                }
            }
        }
        return -1;
    }
}
    