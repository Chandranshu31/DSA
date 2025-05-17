class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
      int max=0;
      int secondMax=0;
      for(int num:nums){
        if(num>max){
          secondMax=max;
          max=num;
        }
       else if(num>secondMax ){
            secondMax=num;
        }
        
      }
      return (max-1)*(secondMax-1);
    }
}

// just find max two elemnts and get the job done with them

// another approach could be by sorting and get the last two elements and perform action

