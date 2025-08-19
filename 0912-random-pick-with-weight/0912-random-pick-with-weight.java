class Solution {
    int prefix[];
    int total;
    Random rand;

    public Solution(int[] w) {
        prefix = new int[w.length];
        //this.total=total;
        rand= new Random();
        prefix[0]=w[0];
        for(int i=1;i<w.length;i++){
            prefix[i]=prefix[i-1]+w[i];
        }
        total=prefix[w.length-1];
        
    }
    
    public int pickIndex() {
        int r= rand.nextInt(total)+1;

        int left=0;
        int right=prefix.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(r<=prefix[mid]){
                right=mid;
            }else{ 
                left=mid+1;
            }
        }
        return left; // return the first indx that is just greater than equal to r
        
    }
}

// we are suppossed to randomly return a weight but the wight with a greater value has more probability of getting returned
// so we calculated prefix sum that generated a range for them... like for[1,3,6]  prefix woudl be [1,4,10] so indx 0 rep 1...indx 1 has 3 bucket values 2,3,4.
// and then randomly generate a nummber in rnge of 1 and ttoal... and then use bin search to fidn the first numb that is bigger or equal to it.. that would return the indx of that weight also
// this is how we managed to biased the prpbability of getting a higher weight indx more.

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */