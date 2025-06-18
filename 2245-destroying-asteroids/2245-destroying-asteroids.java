class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass=mass;
       // boolean canBeDestroyed=true;
        for(int i=0;i<asteroids.length;i++){
            if(currMass>=asteroids[i]){
                currMass+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}