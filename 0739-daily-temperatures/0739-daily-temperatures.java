class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                arr[st.peek()] = i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return arr;
        
    }
}