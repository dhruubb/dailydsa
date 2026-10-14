class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            String c = tokens[i];
            if(c.equals("+") && st.size()>=2){
                int a = st.pop();
                int b = st.pop();
                int ans = a+b;
                st.push(ans);
            }
            else if(c.equals("-") && st.size()>=2){
                int a = st.pop();
                int b = st.pop();
                int ans = b-a;
                st.push(ans);
            }
            else if(c.equals("/") && st.size()>=2){
                int a = st.pop();
                int b = st.pop();
                int ans =0;
                if(a!=0) ans = b/a;
                st.push(ans);
            }
            else if(c.equals("*") && st.size()>=2){
                int a = st.pop();
                int b = st.pop();
                int ans = a*b;
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}