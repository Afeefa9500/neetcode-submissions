class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String i:strs){
            char[] ch=i.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(i);
        }
        for(List<String> i:map.values()){
            l.add(i);
        }
        return l;
    }
}
