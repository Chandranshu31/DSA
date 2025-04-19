class FindSumPairs {
    int nums1[];
    int nums2[];
    HashMap<Integer,Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        map= new HashMap<>();

        for(int num:nums2){
            map.put(num,map.getOrDefault(num,0)+1);  // to store the elements of nums2 and their freq to help us getting in count
        }
        
    }
    
    public void add(int index, int val) {
        int oldVal=nums2[index];
        map.put(oldVal,map.get(oldVal)-1);  // reduce the freq
        if(map.get(oldVal)==0){
            map.remove(oldVal);
        }

        nums2[index]+=val;  // update
        map.put(nums2[index],map.getOrDefault(nums2[index],0)+1);  // update the freq of element , maybe phle se ho to +1 hojyeg wrna defaut 0 then +1
        
    }
    
    public int count(int tot) {
        int c=0;
        for(int i=0;i<nums1.length;i++){
            int diff=tot-nums1[i];
            // now we need to look in that that how many times that diff has appeared, i.e freq so that nums[i] can reach upto tot
            c+=map.getOrDefault(diff,0); // if there is no such numb as diff in map then return 0, so for that nums[i] we cant reach tot
            // and if there is that numb in map then return how many times does it appear in the nums2 i.e its freq so thatmuch pair could be formed
            // and c++;
        }
        return c;
        
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */