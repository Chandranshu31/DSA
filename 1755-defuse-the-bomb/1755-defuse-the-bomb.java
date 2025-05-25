class Solution {
    public int[] decrypt(int[] code, int k) {
        int n= code.length;
        int result[]=new int[n];
        if(k==0){
            return result;
        }
        if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                int count=0;
                int j=i+1;
                while(count<k){
                    sum+=code[j%n];  // forward circular 
                    count++;
                    j++;
                }
                result[i]=sum;
            }
        }
        if(k<0){
            for(int i=n-1;i>=0;i--){
                int sum=0;
                int count=0;
                int j=i-1;
                while(count< -k){    // -(-k)==k so to count
                    sum+=code[(j+n)%n];  // backward circular 
                    count++;
                    j--;
                }
                result[i]=sum;
               
            }
        }

        return result;
        
        
    }
}