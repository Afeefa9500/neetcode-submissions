class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int i:map.keySet()){
            q.offer(i);
            if(q.size()>k){
                q.poll();
            }
        }

        int[] a=new int[k];
        for(int i=0;i<k;i++){
            a[i]=q.poll();
        }
        return a;
    }
}
