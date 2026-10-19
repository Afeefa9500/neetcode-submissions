class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            map.computeIfAbsent(s,k->new ArrayList<>()).add(strs[i]);
        }
        for(List<String> l1:map.values()){
            l.add(l1);
        }
        return l;
    }
}
