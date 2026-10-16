class Solution {
    // TC:O(N KlogK)
    // SC:O(N*K)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            map.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);

        }
        for(List<String> l:map.values()){
            list.add(l);
        }
        return list;
    }
}
