// Two loops are used to find every possible substring starting at i=0 to i = (length)-4 because the minimum length of substring must be 5 to contain each of the vowels.
// A HashSet maintains the vowels encountered in each substring which is cleared after each iteration.
// If the size of the set is 5, we know that each of the 5 vowels are present.
// If a consonant is found, we break out of the inner loop.

class Solution {
    public int countVowelSubstrings(String word) {
       int vowel = 0;
       int n = word.length();
       Set<Character> set = new HashSet<>();
       for (int i=0; i<n-4; i++){
        set.clear();
        for(int j = i; j < n; j++){
            char ch = word.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                set.add(ch);
                if(set.size() == 5){
                    vowel++;
                }
            }
            else{
                break;
            }
        }
       }
       return vowel;
    }
}