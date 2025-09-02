class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        Arrays.sort(points, (a,b) ->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });

        int count=0;
        for(int i=0;i<n;i++){
            int maxY=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                if(points[j][1]<=points[i][1] && points[j][1]>maxY ){
                    count++;
                    maxY=points[j][1];
                }
            }
        }
        return count;

        
        
    }
}