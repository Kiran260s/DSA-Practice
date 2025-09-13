class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        //Instead of comparing all strings we compare two strings as after using array sort field, the first and last are required
        //Sorting works lexicographically it means it compares each alphabet and compare its position
        
        String  str1 = strs[0]; 
        String str2 = strs[strs.length-1];
        int index = 0;
        while(index < str1.length() && index < str2.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
           
        }
         return index==0?"":str1.substring(0,index);
         //Substring method is used to return a part of the string it takes the starting index and end index
    }
}
