public class Solution {
    public double Power(double base, int exponent) {
        double c=base;
        if(exponent==0){
            base=1;
        }
        if(exponent>0){
        for(int i=0;i<exponent-1;i++)
            base=base*c;
        }
        if(exponent<0){
            exponent=-exponent;
            for(int i=0;i<exponent-1;i++){
                 base=base*c;
            }
            base=1/base;
        }
        
        return base;
  }
}
