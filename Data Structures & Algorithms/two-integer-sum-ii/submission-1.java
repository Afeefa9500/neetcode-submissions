class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int c=target-numbers[i];
            if(map.containsKey(c)){
                if(map.get(c)<i+1){
                    return new int[]{map.get(c),i+1};
                }
            }
            map.put(numbers[i],i+1);
        }
        return new int[]{};
    }
}
