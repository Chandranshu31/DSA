class Solution {
    public int countGoodRectangles(int[][] rectangles) {
      //ArrayList<Integer> list = new ArrayList<>();
      HashMap<Integer,Integer> map = new HashMap<>();
      int maxLen=Integer.MIN_VALUE;
      for(int i=0;i<rectangles.length;i++){
        int len =Math.min(rectangles[i][0],rectangles[i][1]);
        map.put(len,map.getOrDefault(len,0)+1);
        maxLen=Math.max(maxLen, len);
      }
      

      return map.get(maxLen);
    }
}