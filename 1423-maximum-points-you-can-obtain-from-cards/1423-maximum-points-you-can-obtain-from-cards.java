class Solution {
    public int maxScore(int[] arr, int k) {
    int n = arr.length ;
   int lsum= 0 ;
   int rsum = 0 ;
   int sum = 0 ;
   for( int i = 0 ; i <= k-1 ; i++){
    lsum = lsum + arr[i];
   }
   sum = lsum;
   int rind = n - 1 ;
   for( int i = k-1 ; i >= 0  ; i-- ){
    lsum = lsum - arr[i];
    lsum = lsum + arr[rind];
    rind--;
    sum = Math.max(sum ,lsum);
   } 
   return sum;
    }
}