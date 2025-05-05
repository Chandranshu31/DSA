class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int count = 0;

        for (int i = 0; i <= n - 2; i++) {
            int a1 = dominoes[i][0];
            int b1 = dominoes[i][1];

            for (int j = i + 1; j < n; j++) {
                int a2 = dominoes[j][0];
                int b2 = dominoes[j][1];

                if ((a1 == a2 && b1 == b2) || (a1 == b2 && b1 == a2)) {
                    count++;
                }
            }
        }

        return count;
    }
}
