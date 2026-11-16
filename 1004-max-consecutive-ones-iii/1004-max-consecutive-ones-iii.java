class Solution {
    public int longestOnes(int[] nums, int k) {
         // ** brute force ... 
        // int maxlen = 0 ; 
        // for( int i = 0 ; i < nums.length ; i++ ){
        //     int zero = 0 ; 
        //     for( int j = i ; j < nums.length ; j++ ){
        //         if( nums[j] == 0 ){
        //             zero++;
        //         }
        //         if( zero <= k ){
        //             int len = j - i + 1 ;
        //             maxlen = Math.max( maxlen , len );
        //         }
        //         else{ 
        //             break ; 
        //         }
        //     }
        // }
        // return maxlen ;
        int n = nums.length ; 
        int r = 0 ; 
        int l = 0 ; 
        int maxlen = 0 ; 
        int zero = 0 ;
        while( r < n){
            if( nums[r] == 0 ){
                zero++;
            }
            if( zero > k ){
            if( nums[l] == 0 ){
                zero--;}
                l++;}
            
            if( zero <= k ){
                int len = r - l + 1 ;
                maxlen = Math.max( maxlen , len );
            }
            r++ ;
        }
        return maxlen ;
    }
}