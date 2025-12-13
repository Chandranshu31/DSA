class Solution {
       class pair {
        String business;
        String code;

        pair(String business, String code) {
            this.business = business;
            this.code = code;
        }
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashSet<String> set= new HashSet<>();
        set.add("electronics");
        set.add("grocery");
        set.add("pharmacy");
        set.add("restaurant");

        HashMap<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        ArrayList<pair> valid = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(!isActive[i]) continue;
            else{
                if(isValidCode(code[i]) && set.contains(businessLine[i])){
                   valid.add(new pair(businessLine[i],code[i]));
                }
            }
        }
            Collections.sort(valid, (a, b) -> {
            if (!a.business.equals(b.business)) {
                return order.get(a.business) - order.get(b.business);
            }
            return a.code.compareTo(b.code);
        });

        List<String> ans = new ArrayList<>();
        for (pair p : valid) {
            ans.add(p.code);
        }
        return ans;
        
    }
    public boolean isValidCode(String code){
        if(code.length()==0) return false;
        for(char c:code.toCharArray()){
            if(!(Character.isLetterOrDigit(c)||c=='_')) return false;
        }
        return true;
    }
}