class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        // we need to figure out the first next smaller right(given the min index) for each element
        int nxtSR[]= new int[prices.length];
        nxtSR[n-1]=0;
        Stack<Integer> s = new Stack<>();
        s.push(prices[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty() && s.peek()>prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtSR[i]=0;
            }else{
               nxtSR[i]=s.peek();
            }
            s.push(prices[i]);
        }

        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=prices[i]-nxtSR[i];
        }

        return res;
    }
}