class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prod= 1;
        int zero=0;
        for(int i : nums){
            if(i!=0){
                prod*=i;
            }
            else zero++;
        }

        for(int i=0; i<n; i++){
            if(nums[i]!=0 && zero==0){
                ans[i] = prod/nums[i];
            }
            else if(nums[i]!=0 && zero>0){
                ans[i] = 0;
            }
            else if(nums[i]==0){
                if(zero==1) ans[i] = prod;
                else if(zero>1) {
                    ans[i] = 0;
                    // zero--;
                    }
                
            }
        }
        return ans;
    }
}