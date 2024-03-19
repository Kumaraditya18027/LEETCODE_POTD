class Solution {
    public int leastInterval(char[] tasks, int n) {
       int []freq=new int[26];
       for(char c:tasks)
       {
        freq[c-'A']++;
       }
       Arrays.sort(freq);
       int batch=freq[25];
       int vac_slots=--batch*n;
       for(int i=0;i<25;i++)
       {
          vac_slots-=Math.min(freq[i],batch);
       }
       return vac_slots>0?vac_slots+tasks.length:tasks.length;
    }
}