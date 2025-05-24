class Solution {
    public int longestContinuousSubstring(String s) {
         int maxLen = 1; // because a single charactr also gets includes so atleast 1 is guaranteed
         int count = 1;
         for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)==1){  // if consecutive alphabet then increase the count
                count++;
            }
            else{
                count=1;  // if alphabetically not continous set the count to 1 again for the next part
            }
            if(count>1){
            maxLen=Math.max(count,maxLen);  // keep updating the maxlen part only when count gets greater than 1
            }
         }

         return maxLen;
    }
}

// 400th leetcode ques of min, 25-05-2025,19:00