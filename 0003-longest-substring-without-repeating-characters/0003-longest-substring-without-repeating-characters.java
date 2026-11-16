class Solution {
    public int lengthOfLongestSubstring(String s) {
        // /// BRUTE FORCE ; 
        // int len = 0 ; 
        // int n = s.length();
        // for( int i = 0 ; i < n ; i++){
        //     int[] hash = new int[250];
        //     for( int j = i ; j < n ; j++){
        //         if( hash[s.charAt(j)] == 1 ){
        //             break ;
        //         }
        //         int len2 = j - i + 1 ;
        //         len = Math.max( len , len2 );
        //         hash[s.charAt(j)] = 1 ; 

        //     }
        // }
        // return len ; 
        int[] hash = new int[250];
        Arrays.fill(hash, -1);
        int l = 0 ;
        int r = 0 ;
        int maxlen = 0 ;
        int n = s.length() ; 
        while( r < n ){
                if ( hash[s.charAt(r)] >= l ){
                    l = hash[s.charAt(r)] + 1 ; 
                }
            
            int len = r - l + 1 ;
            maxlen = Math.max( len , maxlen );
            hash[s.charAt(r)] = r ; 
            r++;
        }
        return maxlen ; 
        
    }
}