class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            int len = sb.length();
            // if last two chars are same as current, skip it
            if (len >= 2 && sb.charAt(len - 1) == curr && sb.charAt(len - 2) == curr) {
                continue;
            }

            sb.append(curr);
        }

        return sb.toString();
    }
}
