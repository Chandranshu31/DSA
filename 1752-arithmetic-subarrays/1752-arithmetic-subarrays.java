class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int i=0;// to point on l
        int j=0; // to point on r
        List<Boolean> res = new ArrayList<>();
        while(i<l.length && j<r.length){
            int a=l[i];
            int b=r[i];
            List<Integer> temp = new ArrayList<>();
            for(int k=a;k<=b;k++){
                temp.add(nums[k]);
            }
            Collections.sort(temp);
            boolean isAir=true;
            if(temp.size()>=2){
                int diff=temp.get(1)-temp.get(0);
                for(int z=2;z<temp.size();z++){
                    if(temp.get(z)-temp.get(z-1)!=diff){
                        isAir=false;
                        break;
                    }
                }
            }
          
            res.add(isAir);
            i++;
            j++;

        }

        return res;
        
        
    }
}