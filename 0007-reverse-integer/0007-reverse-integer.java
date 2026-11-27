class Solution {
    public int reverse(int x) {
        int ori = x ; 
        int rev = 0 ; 
        for( int i = x ; i !=  0 ; i= i / 10){
            int dig = i % 10 ; 
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0;
            }
            rev = rev*10+dig ;
        }
        // if( ori < 0 ){
        //     rev = rev * -1;
        // }
        return rev ;


    }
}