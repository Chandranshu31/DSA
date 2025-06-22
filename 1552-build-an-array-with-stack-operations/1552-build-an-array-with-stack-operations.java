class Solution {
    public List<String> buildArray(int[] target, int n) {
       int k=target.length;
       HashSet<Integer> set = new HashSet<>();
       for(int num:target){
        set.add(num);
       }
       int matched=0;
       List<String> res = new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(set.contains(i)){
            res.add("Push");
            matched++;
            if(matched==k) break;
        }else{
            res.add("Push");
            res.add("Pop");
        }
       }

       return res; 
    }
}