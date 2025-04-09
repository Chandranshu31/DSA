class Solution {
    public int minOperations(int[] nums, int k) {
        int n= nums.length;
        HashSet<Integer> hs = new HashSet<>();
     
        for(int num: nums){  // add all the elements into hashset to get the disinct numbers
            hs.add(num);
        }

        if(hs.size()==1 && hs.contains(k)){  // if at the end there is only 1 number and that is equal to k (means all elements(wether their count was 0,1,or n) in array  were same and equal to k )
            return 0;  // then no need to change 
        } 

        for(int num: hs){
            if(num<k){    // if in hs there is a numb that is ,k then we can't change it as no valid H will be there
                return -1;
            }
        }

        int count=-1;  // otherwise 
        for(int num: hs){
            if(num>k){   // count the disticnt numbs greater than k
                count++;
            }
        }

        if(count<0){
            return count;
        }
        return count+1;
        
    }
}