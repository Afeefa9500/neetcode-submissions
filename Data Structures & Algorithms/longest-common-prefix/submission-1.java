class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int minlen=strs[0].length();
        for(String i:strs){
            minlen=Math.min(minlen,i.length());
        }
        for(int i=0;i<minlen;i++){
            char c=strs[0].charAt(i);
            for(String s:strs){
                if(s.charAt(i)!=c)return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}