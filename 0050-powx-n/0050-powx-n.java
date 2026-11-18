class Solution {
    public double myPow(double x, int n) {
     double res = 1.0 ; 
     long  pow = n ; 
     boolean neg = false ; 
     if ( pow < 0 ){
        neg = true ; 
        pow = pow *(-1);
     }
     while( pow > 0 ){
        if( pow % 2 == 0 ){
            x = x * x ;
            pow = pow / 2 ;
        }

        else{
            res = res * x ; 
            pow = pow - 1 ; 
        }
     }
        
        if( neg ){
            res = 1.0 / res ; 
        }
        return res ;

    }
}