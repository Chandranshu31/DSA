class Solution {
    public int[] evenOddBit(int n) {
        String binary = Integer.toBinaryString(n);
        int even = 0, odd = 0;

        // Traverse from right to left (LSB to MSB)
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(binary.length() - 1 - i);
            if (bit == '1') {
                if (i % 2 == 0) even++;
                else odd++;
            }
        }

        return new int[]{even, odd}; // even bits at index 0, odd at index 1
    }
} 
