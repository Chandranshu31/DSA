class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int boatsUsed=0;
       int start=0;
       int end=n-1;
       while(start<=end){
        int currWeight=people[start]+people[end];
        if(currWeight>limit){
            boatsUsed++; // the people present at the end index will occupy a single boat
            end--;
        }
        else if(currWeight<=limit){ // if the currWeight sum is within our limit range then send both of them in the same boat and increment the count
            boatsUsed++;
            start++;
            end--;
        }

       }
       return boatsUsed; 
    }
}
