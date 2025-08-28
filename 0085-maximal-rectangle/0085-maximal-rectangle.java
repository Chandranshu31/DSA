class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length, n= matrix[0].length;
        int maxArea=0;
        int heights[]=new int[n];
        for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]=='1'){
                        heights[j]+=1;
                    }else{
                        heights[j]=0;
                    }
                }
                maxArea=Math.max(maxArea,findMaxRectangle(heights));
        }
        return maxArea;
        
    }
    public int findMaxRectangle(int heights[]){
        int n=heights.length;
        int NSR[]=new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=heights[i];
            while(!s.isEmpty()&& curr<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                NSR[i]=n;
            }else{
                NSR[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();

        int NSL[]=new int[n];
        for(int i=0;i<n;i++){
            int curr=heights[i];
            while(!s.isEmpty() && heights[s.peek()]>=curr){
                s.pop();
            }
            if(s.isEmpty()){
                NSL[i]=-1;
            }
            else{
                NSL[i]=s.peek();
            }
            s.push(i);
        }

        int maxArea=0;
        for(int i=0;i<n;i++){
            int height=heights[i];
            int width=NSR[i]-NSL[i]-1;
            int area=height*width;
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
    }
}