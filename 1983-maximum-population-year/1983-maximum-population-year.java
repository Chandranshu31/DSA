class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101]; // Years 1950 to 2050 (exclusive)

        for (int[] log : logs) {
            int birth = log[0], death = log[1];
            population[birth - 1950]++;  // born, +1
            population[death - 1950]--;  // died, -1 (death year not included)
        }

        int maxPop = 0, year = 1950;
        int currPop = 0;

        for (int i = 0; i < 101; i++) {
            currPop += population[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                year = 1950 + i;
            }
        }

        return year;
    }
}
