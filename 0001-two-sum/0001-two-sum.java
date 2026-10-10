class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], i);
        }
        int[] arr = new int[2];
        for(int i=0; i<n; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                arr[0] = i;
                arr[1] = map.get(diff);
                break;
            }
        }
        return arr;
    }
}