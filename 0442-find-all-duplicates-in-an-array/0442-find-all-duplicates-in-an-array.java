class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>al=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int num=Math.abs(nums[i]);
            int index=num-1;
            if(nums[index]<0)
            {
                al.add(num);
            }
            nums[index]=(-nums[index]);
        
        }
        return al;
    }
}