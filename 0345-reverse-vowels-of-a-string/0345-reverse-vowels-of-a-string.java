class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {

            while (start < end && !(arr[start] == 'a' || arr[start] == 'e' || arr[start] == 'i' || arr[start] == 'o' || arr[start] == 'u' ||
                                    arr[start] == 'A' || arr[start] == 'E' || arr[start] == 'I' || arr[start] == 'O' || arr[start] == 'U')) {
                start++;
            }

            while (start < end && !(arr[end] == 'a' || arr[end] == 'e' || arr[end] == 'i' || arr[end] == 'o' || arr[end] == 'u' ||
                                    arr[end] == 'A' || arr[end] == 'E' || arr[end] == 'I' || arr[end] == 'O' || arr[end] == 'U')) {
                end--;
            }

            char curr = arr[start];
            arr[start] = arr[end];
            arr[end] = curr;
            start++;
            end--;
        }

        String res = new String(arr);
        return res;
    }
} 

// if not equal to vowel then just keep moving start and end , the moment u face two vowels just swap them
