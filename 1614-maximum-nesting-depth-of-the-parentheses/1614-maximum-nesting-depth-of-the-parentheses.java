class Solution {
    public int maxDepth(String s) {
        //This code does not checks the string for its validity ,it only calculates the depth of parantheses.
        int  max_top=0;
        int maxi=0;
         for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i)=='(')
            {
                max_top++;
                if(maxi<max_top)
                maxi=max_top;
            }
            else if(s.charAt(i)==')')
            {
                max_top--;
            }
         }
         return maxi;
    }
}