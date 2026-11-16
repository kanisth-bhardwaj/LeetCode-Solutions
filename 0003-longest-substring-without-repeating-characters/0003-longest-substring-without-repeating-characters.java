class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0 ; 
        int n = s.length();
        for( int i = 0 ; i < n ; i++){
            int[] hash = new int[250];
            for( int j = i ; j < n ; j++){
                if( hash[s.charAt(j)] == 1 ){
                    break ;
                }
                int len2 = j - i + 1 ;
                len = Math.max( len , len2 );
                hash[s.charAt(j)] = 1 ; 

            }
        }
        return len ; 
        
    }
}