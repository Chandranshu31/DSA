class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        if (n < 3) {  // we atleast need 3 elements to have triplets
            return 0;
        }
        for (int i = 0; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k <=n-1; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
// the basic approach would be to run a loop form i to n,jton,kton and then check wether condition satiesfies
// a bit improved would be to itrate i from 0 to<=n-3, j to<=n-2 and k to <=n-1 and then check condition
// a bit more improved would be to check first condition before enetering into the third loop
// and then check the rest conditions
