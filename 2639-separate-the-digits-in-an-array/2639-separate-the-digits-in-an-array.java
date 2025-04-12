class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){ 

            int curr=nums[i]; 

            if(curr==0){
                list.add(0,0);
                continue;
            }

              
            ArrayList<Integer> temp = new ArrayList<>();   // to store the digits of current numb 
            while(curr>0){
                int ld=curr%10;
                temp.add(0,ld);  // add at front always 
                curr=curr/10;
            }
            list.addAll(temp);

        }

        int res[]=new int[list.size()];
        int idx=0;
        for(int num:list){
            res[idx++]=num;
        }
        return res;
        
    }
} 


/**
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i++){  
            int curr=nums[i];  
            if(curr==0){
                list.add(0,0);
                continue;
            }
            while(curr>0){
                int ld=curr%10;
                list.add(0,ld);
                curr=curr/10;     // another try but out of bound 
            }
        }
        int res[]=new int[list.size()];
        int idx=0;
        for(int num:list){
            res[idx++]=num;
        }
        return res;
        
    }
}  */