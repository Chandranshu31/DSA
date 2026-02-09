class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        List<Long> stack = new ArrayList<>();

        for (int num : nums) {

            stack.add((long) num);

            // Keep merging while last two are equal
            while (stack.size() >= 2) {

                int size = stack.size();
                long last = stack.get(size - 1);
                long secondLast = stack.get(size - 2);

                if (last == secondLast) {
                    stack.remove(size - 1);
                    stack.remove(size - 2);
                    stack.add(last + secondLast);
                } else {
                    break;
                }
            }
        }

        return stack;
    }
}
