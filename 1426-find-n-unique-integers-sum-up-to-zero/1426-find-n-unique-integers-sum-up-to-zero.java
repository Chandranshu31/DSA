class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if(n%2==0){
            int a=n/2;
            for(int i=a;i>0;i--){
                res.add(-i);
            }
            for(int j=1;j<=a;j++){
                res.add(j);
            }
        }else{
            int a=n/2;
             for(int i=a;i>0;i--){
                res.add(-i);
            }
            res.add(0);
            for(int j=1;j<=a;j++){
                res.add(j);
            }

        }

          int[] ans =new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;

        
    }
} 