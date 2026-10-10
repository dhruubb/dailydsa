class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        int l=0;
        List<String> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            char c = s.charAt(i);
            if(c=='(') count++;
            if(c==')') count--;
            if(count==0 && i>0){
                list.add(s.substring(l, i+1));
                l = i+1;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            String temp = list.get(i);
            int len = temp.length();
            if(len>2){
                ans.append(temp.substring(1, len-1));
            }
        }

        return ans.toString();
    }
}