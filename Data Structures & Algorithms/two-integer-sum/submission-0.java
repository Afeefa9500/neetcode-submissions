class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rest=target-nums[i];
            if(m.containsKey(rest)){
                return new int[]{m.get(rest),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}
