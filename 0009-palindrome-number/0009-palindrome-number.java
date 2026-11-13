class Solution {
    public boolean isPalindrome(int x) {
         int ori = x;
         int  rev = 0;
       for (int i=x ; i > 0; i/=10){
        rev =rev*10+(i%10);
        }
        if (ori==rev){
            return true;
        } 
        else{
            return false;
        }
    }
}