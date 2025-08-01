class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int num: nums){
            temp.add(num);
        }
        while(temp.size()>1){
            ArrayList<Integer> next = new ArrayList<>();
            for(int i=0;i<temp.size()-1;i++){
                next.add((temp.get(i)+temp.get(i+1))%10);
            }
            temp=next;
        }
        return temp.get(0);
    }
}