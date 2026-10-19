class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> min=new PriorityQueue((a,b)->map.get(a)-map.get(b));
        for(int i:map.keySet()){
            min.offer(i);
            if(min.size()>k){
                min.poll();
            }
        }
        int[] a=new int[k];
        for(int i=0;i<k;i++){
            a[i]=min.poll();
        }
        return a;
    }
}
