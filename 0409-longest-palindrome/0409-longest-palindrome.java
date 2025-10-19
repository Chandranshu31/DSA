class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII range
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : freq) {
            length += count / 2 * 2; // add even part
            if (count % 2 == 1) hasOdd = true;
        }

        if (hasOdd) length += 1; // one odd char can go in center

        return length;
    }
}
