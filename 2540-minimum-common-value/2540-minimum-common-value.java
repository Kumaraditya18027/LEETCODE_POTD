class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer> mp=new HashMap<>();
     for(int n:nums1)
     {
         mp.put(n,mp.getOrDefault(n,0)+1);
     }
     for(int k:nums2)
     {
         if(mp.containsKey(k)&& mp.get(k)>0)
         return k;
     }
     return -1;

    }
}