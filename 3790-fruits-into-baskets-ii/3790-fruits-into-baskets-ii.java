class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean placed[]=new boolean[fruits.length];
        HashSet<Integer> occupied= new HashSet<>();
        int count=0;
        for(int i=0;i<fruits.length;i++){
            int curr=fruits[i];
            for(int j=0;j<baskets.length;j++){
                if(!occupied.contains(j) && baskets[j]>=curr){
                    placed[i]=true;
                    occupied.add(j);
                    break;
                }
            }
        }
        for(boolean res: placed){
           if(res==false) count++;
        }
        return count;
    }
}

/**
A good soln is this
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length, a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (fruits[i] <= baskets[j]) {
                    a++;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        return n - a;  // total - placed= unplaced

    }
} */