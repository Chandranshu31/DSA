class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
          int i = num.length - 1;
        
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i]; // add current digit to k
                i--;
            }
            res.addFirst(k % 10); // take last digit
            k /= 10;              // reduce k
        }
        return res;

  
        
    }
}