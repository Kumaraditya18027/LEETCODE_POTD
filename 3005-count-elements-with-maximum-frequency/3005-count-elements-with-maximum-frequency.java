class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        int count = 0;
        int mx = Integer.MIN_VALUE;
        for (int freq : mp.values()) {
            mx = Math.max(mx, freq);
        }
        for (int freq : mp.values()) {
            if (freq == mx)
                count += mx;
        }
        return count;
    }
}