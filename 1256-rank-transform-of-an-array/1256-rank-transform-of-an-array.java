class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int i=0;i<copy.length;i++){
            if(!map.containsKey(copy[i])){ // no need to insert duplicate as all the duplicate numbs would  have the same rank
                map.put(copy[i],rank++);
            }
        }

        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);  // get the rank of curr el of arr and put it in res
        }

        return res;


    }
}