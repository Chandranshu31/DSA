class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num:candyType){
            hs.add(num);
        }
        // hs has the numb of unique candies present and n/2 is the amnt of candies she can eat
        // and we are supposed to tell that how many unique candies she can eat so its simple
        // if choices>no of unique candies still she would be only able to eat as much unique candies that are there
        // if unique> choices still she would be able to eat choices numb of unique candies only andnot all
        return Math.min(hs.size(),n/2);
        


        

        
    }
}