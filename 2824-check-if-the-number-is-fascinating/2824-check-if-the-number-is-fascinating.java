class Solution {
    public boolean isFascinating(int n) {
        String num = "" + n + (2*n) + (3*n);
        if (num.length() != 9) return false; // fascinating numbers always form 9 digits
        boolean[] seen = new boolean[10]; // index 1-9 for digits
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit == 0 || seen[digit]) {
                return false; // 0 or repeated digit
            }
            seen[digit] = true; // keep marking a digit seen
        }
        return true;
    }
}
