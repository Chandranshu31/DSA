class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int card : deck){
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;
        for(int freq : map.values()){
            gcd = findGCD(gcd, freq);
        }

        return gcd >= 2;
    }

    public int findGCD(int a, int b){
        if(b == 0) return a;
        return findGCD(b, a % b);
    }
}
