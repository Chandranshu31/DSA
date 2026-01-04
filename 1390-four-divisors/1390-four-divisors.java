class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            if(numbOfDivisor(curr)==4){
                ArrayList<Integer> divisor= new ArrayList<>();
                divisors(curr,divisor);
                for(int num:divisor){
                    sum+=num;
                }

            }
        }
        return sum;
        
    }
    public int numbOfDivisor(int n){
        if(n==1) return 1;
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i==n) count+=1;
                else count+=2;
            }
        }
        return count;
    }
    public void divisors(int num, ArrayList<Integer> temp){
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                temp.add(i);
                if(i!=num/i){
                    temp.add(num/i);
                }
            }
        }
    }
}
//  all the divisors occur in pair and before the sqr root only...so if we get n%i==0 then count+=2 as i and nu/i...all the i occurs before srt of n and num/i after that so thaths how