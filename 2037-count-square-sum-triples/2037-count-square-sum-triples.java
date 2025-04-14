class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                for(int k=j+1;k<=n;k++){
                    if(i*i + j*j ==k*k){
                        count++;
                    }
                }
            }
        }
        return 2*count; // because if a^2+b^2=c^2 then b^2+a^2 also equals to c^2 thats why to we need to count them as
        // well beacuse no order mentioned 
        
    }
}