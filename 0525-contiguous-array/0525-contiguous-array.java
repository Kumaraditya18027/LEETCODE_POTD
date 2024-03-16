class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer> mp=new HashMap<>();
      int run_sum=0;
      int count=0;
      for(int i=0;i<nums.length;i++)
      {
        run_sum+=(nums[i]==1)?1:-1;
        if(run_sum==0)
        {
            //If we get a equal number of one and zero , then count becomes 0.
            count=i+1;
        }
        //if got the same number as previuoly obtained,then 
      /*    nums = [1,1,0,0,1,1,0,1,1]
            sum = [1,2,1,0,1,2,1,2,3]
            Observe it carefully. If you find a sum which you have already found.
            you actually have a subarr with equal number of 0's and 1's. 
            For example. in the sum array you have 2 as the sum in index 1. 
            you found the sum 2 again in index 5. see the elements of nums from index 1+1 to 5 you have equal number of 0's and 1's*/
        else if(mp.containsKey(run_sum))
        count=Math.max(count,i-mp.get(run_sum));
        else
        mp.put(run_sum,i);
      }
      return count;

        
    }
}