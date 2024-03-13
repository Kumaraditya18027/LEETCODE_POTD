class Solution {
    public int pivotInteger(int n) {
    
        int x;
        if(n==1||n==0)
        return n;
        for(int i=1;i<=n;i++)
        {
            x=i;
            int left=x*(x+1)/2;
            int right=(n*(n+1)/2)-(left-x);
            if(left==right)
            return x;
        }
        return -1;

    }
}