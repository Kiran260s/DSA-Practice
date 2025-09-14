class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' ||
                 s.charAt(i) == '['){
                //for opening bracket
                st.push(s.charAt(i));
                }
                //Closing part
                else{
                    if(st.isEmpty()){
                        return false;
                    }
                    if(st.peek() == '(' && s.charAt(i) == ')'||
                       st.peek() == '{' && s.charAt(i) == '}'||
                       st.peek() == '[' && s.charAt(i) == ']'){
                        st.pop();
                       }
                       else {
                        //no match
                        return false;
                     }   

                }
        }
        return st.isEmpty();
}}