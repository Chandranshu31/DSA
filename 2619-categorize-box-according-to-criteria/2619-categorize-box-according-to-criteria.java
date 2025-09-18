class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long) length*width*height;
            boolean isBulky = length >= 10000 
                         || width >= 10000 
                         || height >= 10000 
                         || vol >= 1_000_000_000L;
        
        boolean isHeavy = mass >= 100;

        if(isBulky && isHeavy) return "Both";
        else if(isBulky && (!isHeavy)) return "Bulky";
        else if(isHeavy && (!isBulky)) return "Heavy";  
        else return "Neither";

    }
}