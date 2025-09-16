import java.util.*;

public class Solution {
    // gcd function
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // lcm function
    private long lcm(long a, long b) {
        return (a / gcd((int) a, (int) b)) * b; // careful with overflow
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
            // keep checking from the end
            while (list.size() >= 2) {
                int x = list.get(list.size() - 1);
                int y = list.get(list.size() - 2);
                int g = gcd(x, y);
                if (g == 1) break; // coprime, stop merging
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                long merged = lcm(x, y);
                list.add((int) merged); // if constraints are small
            }
        }
        return list;
    }

   
}
