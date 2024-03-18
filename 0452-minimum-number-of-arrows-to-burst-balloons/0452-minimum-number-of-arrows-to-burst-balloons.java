class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int []>(){
          @Override
          public int compare(int []a,int []b)
          {
            return Integer.compare(a[1],b[1]);
          }
        });
        int n=points.length;
        int count=1;
        int limit=points[0][1];
        for(int i=0;i<n;i++)
        {
            if(points[i][0]>limit)
            {
                count++;
                limit=points[i][1];
            }
        }
        return count;
    }
}