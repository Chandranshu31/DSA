class Solution {
    public long[] sumOfThree(long num) {
        long[] res = new long[3];
        if((num-3)%3!=0){
            return new long[0];
        }
        long first=(num-3)/3;
        res[0]=first;
        res[1]=first+1;
        res[2]=first+2;
        return res;
        
    }
}

// for consecutive three sum.... a+a+1+a+2==num... threfore 3a+3=num, a=(num-3)/3... so if thre exists and integer a
// then num-3 must be divisble by 3... if no then no such pairs exists.. if yes then a=num-3)/3.. and a+1,a+2