class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int boatsUsed=0;
       int start=0;
       int end=n-1;
       while(start<=end){
        int sum=people[start]+people[end];
        if(sum>limit){
            boatsUsed++;
            end--;
        }
        else if(sum<=limit){
            boatsUsed++;
            start++;
            end--;
        }else{
            break;
        }

       }
       return boatsUsed;


    }
}
