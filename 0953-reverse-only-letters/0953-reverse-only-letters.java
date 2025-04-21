class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int start=0;
        int end=s.length()-1;

        while(start<end){
            while(start<end && !((arr[start]>=65 && arr[start]<=90) || (arr[start]>=97 && arr[start]<=122))){
                start++;
            }
            while (start < end && !((arr[end] >= 65 && arr[end] <= 90) || (arr[end] >= 97 && arr[end] <= 122))) {
              end--;
            }

            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        String reversedOnlyLetterString = new String(arr);
        return reversedOnlyLetterString;
        
    }
}  //ASCII OF UPPERCASE IS 65 TO 90 AND LOWER CASE IS 97 TO 122, SO IF THE ASCII VALUE OF
// CHAR DOESNOT FALLS IN THIS RANGE THEN KEEP MOVING THE POINTERS