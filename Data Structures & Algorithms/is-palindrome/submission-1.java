class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        char[] c=s.toCharArray();
        int l=0;
        int r=c.length-1;
        while(l<r){
            if(c[l]!=c[r])return false;
            l++;
            r--;
        }
        return true;
    }
}
