class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int l=0;
        while(l<n && s.charAt(l)==')'){
            l++;
        }
        int rem = l;
        int open =0;
        int onep = 0;
        int two0 = 0;
        int cnt = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c=='('){
                if(st.size()%2==1){
                    cnt++;
                    st.pop();
                }
                st.push(')');
                st.push(')');
            }
            else{
            if(!st.isEmpty()) st.pop();
            else {
                cnt++;
                st.push(')');
            }
            } 
        }

        // if(rem>0){
        //     
        //     return Math.abs(open*2 - close) + rem/2 + rem%2+extra;
            
        // }
        int extra = 0;
        if(rem%2!=0) extra = 1;
        return st.size() +cnt; 
    }
}