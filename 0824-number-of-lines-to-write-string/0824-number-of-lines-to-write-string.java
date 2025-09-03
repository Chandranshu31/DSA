class Solution {
    public int[] numberOfLines(int[] widths, String s) {  
        int lines = 1;
        int width = 0;

        for (char c: s.toCharArray()) {
            int w = widths[c-'a']; // get the width  of the curr char from array..as width[0] represents widht of a so therefore
            if (width + w > 100) { // if it exceeds 100 pixels then go to next line, i.e update the lines count
                lines++;
                width = w; 
            } else {
                width += w;
            }
        }

        return new int[]{lines, width};
    }
}
