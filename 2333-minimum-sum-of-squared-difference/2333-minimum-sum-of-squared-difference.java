class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            int d = Math.abs(nums1[i]-nums2[i]);
            diff[i] = d;
            max = Math.max(max, d);
        }
        long total =0;
        int[] freq = new int[max+1];
        for(int d : diff){
            total+=d;
            freq[d]++;
        }
        
        long cnt = (long)k1+k2;
        long ans = 0;
        if(total<=cnt) return 0;
        for(int i=max; i>0 && cnt>0; i--){
            if(freq[i]==0) continue;
            long use = Math.min(cnt, freq[i]);
            freq[i]-=(int) use;
            freq[i-1]+=(int) use;
            cnt-=use;
        }

        for(int i=1; i<=max; i++){
            ans+=(long) i*i*freq[i];
        }
        return ans;
        
        
    }
}