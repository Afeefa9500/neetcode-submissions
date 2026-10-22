class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            int k=nums.length-1;
            int j=i+1;
            if(i>0 && nums[i]==nums[i-1])continue;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);
                    l.add(l1);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(k>j && nums[k]==nums[k+1])k--;
                }
                else if(sum<0)j++;
                else k--;
            }
        }
        return l;
    }
}
