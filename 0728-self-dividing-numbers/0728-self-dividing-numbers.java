class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int curr=i;
            int temp=i;
            boolean isSelfDivisor = true;
            while(temp>0){
                int lastDigit= temp%10;
                if(lastDigit==0){
                    isSelfDivisor=false;
                    break;
                }
                if(curr%lastDigit!=0){
                    isSelfDivisor=false;
                }
                temp=temp/10;
            }
            if(isSelfDivisor){
                list.add(i);
            }
        }
        return list;
           
    }
}