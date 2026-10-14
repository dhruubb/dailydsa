class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int n = (int)Math.pow(10, num);
        n--;
        int bound = 0;
        if(num>1){
        bound = (int)Math.pow(10, num-1);
        }
        int ans = 0;
        StringBuilder res = new StringBuilder();
        int s = sum;
        StringBuilder temp = new StringBuilder();
        while(num>=0){
            for(int i=9; i>=0; i--){
                if(s==0 && num==0){
                    return temp.toString();
                }
                if(i<=s && num>=1){
                    temp.append(Integer.toString(i));
                    s-=i;
                    break;
                }
                
            }
            num--;
        }
        return res.toString();
    }
}