class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(g);  // sort the array so that we can get the min coookie sie and min content capacity together
         Arrays.sort(s);
         int a=0;  //point on greed
         int n=g.length;
         int b=0;  // point on size of cookie
        int m=s.length;
         int count=0;
         while(a<n && b<m){
            if(s[b]>=g[a]){  // if we got a cookie that is bigger or equal than its greed 
                count++;  //feed the kid
                  a++; // move on to satisfy the greed of next kid
            }
          
            b++;  //move on to next cookie size
         }
         return count;
         
    }
}