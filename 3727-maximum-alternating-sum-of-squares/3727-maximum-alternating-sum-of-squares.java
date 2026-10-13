class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>((a,b)->b-a);
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i=0; i<n; i++){
            int temp = nums[i];
            nums[i] = Math.abs(temp);
        }
        long add =0;
        long sub = 0;
        int size = map.size();
        int i=0;
        Arrays.sort(nums);
        int l=0;
        int r = n-1;
        while(l<n/2){
            sub+=Math.pow(nums[l], 2);
            l++;
        }
        while(l<n){
            add+=Math.pow(nums[l], 2);
            l++;
        }
        return add-sub;

    }
}