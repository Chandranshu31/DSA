class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int res[]= new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1;i>=0;i--){
            // iterate from right to left

            while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                res[i]=s.peek()-i;
            }

            s.push(i);
        }
        return res;
    }
}
/**
The idea is to store the indices of elements into stack
for a particular day keep poping the elements from stack until you get cooler days that is temp[s.peek]<=curr(tmp[i])
the moment you stop is either due to two things, 1st the stack got empty or you found a hotter day
// if the stack is not empty the peek has the warmer days index so just add that to res by subtracting ur indiex to get the
numb of days u had to wait
or if stack got  or previously empty thn just push curr indx */

/**AN ALTERNATE SOLUTION WHICH TAKES O(N^2) time comp but passes 47/48 test cases here except one in which ther was TLE
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int res[]=new int[n];  // initially everything == 0 

        for(int i=0;i<n;i++){
            int curr=temperatures[i];
            int count=0;
            for(int j=i+1;j<n;j++){
                if(temperatures[j]>curr){  // the moment we get a warmer day count++ so count the warmer day fill the res adn immediately break
                    count++;
                    res[i]=count;
                    break;
                }
                else{
                    count++;  // otherwise keep increasing the count
                }
            }  // and if loop exists without updating res that means there were no warmer days ahead of it and at that indx 0 will be there already as no updation
        
        
        }
        return res;    
    }
} */