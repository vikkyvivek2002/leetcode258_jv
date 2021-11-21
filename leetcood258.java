class Solution {
    public int addDigits(int num) {
        int x =0;
        while(num>0)
        {
            x = x+num%10;
            num = num/10;
            
            if(num == 0 && x>9){
                num = x ;
                x=0;
            }
        }
        return x;
    }
}