class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return letters[start %letters.length];
        
    }
}

/**
At the end of the loop:

low ends up pointing to the first character > target, if it exists.

If all characters are ≤ target, then low == letters.length. */