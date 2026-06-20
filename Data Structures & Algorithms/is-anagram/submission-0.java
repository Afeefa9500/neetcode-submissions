class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        HashMap<Character,Integer> m=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            m.put(c1,m.getOrDefault(c1,0)+1);
            m.put(c2,m.getOrDefault(c2,0)-1);
        }
        for(int i:m.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
