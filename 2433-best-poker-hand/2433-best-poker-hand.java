class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        // Check flush
        boolean flush = true;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }
        if (flush) return "Flush";

        // Count ranks
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int r : ranks) {
            freq.put(r, freq.getOrDefault(r, 0) + 1);
        }

        for (int count : freq.values()) {
            if (count >= 3) return "Three of a Kind";
        }
        for (int count : freq.values()) {
            if (count == 2) return "Pair";
        }
        return "High Card";
    }
}
