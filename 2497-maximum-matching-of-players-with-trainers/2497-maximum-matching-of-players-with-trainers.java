class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=players.length,m=trainers.length;
        int i=0;
        int j=0;
        int count=0;
        while(i<n && j<m){
            if(trainers[j]>=players[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;

        // we did the sorting part to match  the player with less ability with coach with less training capacity, so 
        // that we dont waste a high capacity coach on low ability player, that wont help help us to maximize the count
        
        
    }
}