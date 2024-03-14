class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer>mp=new HashMap<>();
        int curr_sums=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            curr_sums+=nums[i];
            if(curr_sums==goal)
            {   
                count++;
            }
            count+=mp.getOrDefault(curr_sums-goal,0);
            mp.put(curr_sums,mp.getOrDefault(curr_sums,0)+1);
        }
        return count;
    }
}