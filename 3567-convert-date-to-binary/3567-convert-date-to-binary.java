class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder result = new StringBuilder();
        StringBuilder buffer = new StringBuilder();
        
        for (char c : date.toCharArray()) {
            if (c != '-') {
                buffer.append(c);
            } else {
                int value = Integer.parseInt(buffer.toString());
                result.append(Integer.toBinaryString(value)).append('-');
                buffer.setLength(0); // clear buffer
            }
        }
        
        // Handle the last segment (day) after loop
        int value = Integer.parseInt(buffer.toString());
        result.append(Integer.toBinaryString(value));
        
        return result.toString();
    }
}
