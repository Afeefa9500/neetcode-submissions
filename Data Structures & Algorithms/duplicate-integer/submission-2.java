class Solution {
    public boolean hasDuplicate(int[] nums) {

        // HashMap  TC: o(n) SC:o(n) number of passes: 2


        /*HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            if(i>1)return true;
        }
        return false;*/


        //HashSet TC:o(n) SC:o(n) number of passes: 1  so optimal. 
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);
        if(set.size()!=nums.length)return true;
        return false;
    }
}