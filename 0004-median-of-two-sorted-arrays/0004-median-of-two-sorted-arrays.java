class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length ;
        int m = nums2.length ;
        int x = n+m;
        int[] arr = new int[x];
        for( int i = 0 ; i < x ; i++ )
        {
            if( i < n ){
                arr[i] = nums1[i];
            }
            else{
                arr[i] = nums2[i - n ];
            }
        }
        Arrays.sort(arr);
        double med = 0 ; 
        
        
if (x % 2 == 1) {
            med = arr[x / 2];
        } else {
            med = (arr[x / 2 - 1] + arr[x / 2]) / 2.0;
        }
        return med ;
    }
}