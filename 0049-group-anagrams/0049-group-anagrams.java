class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length==0) return res;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            char arr[]=curr.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(curr);
        }
        res.addAll(map.values());
        return res;
        
    }
} 

/** ANOTHER VALID SOLUTION
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length==0) return res;
        HashSet<Integer> groupped = new HashSet<>();
        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            if(groupped.contains(i)) continue;

            
            ArrayList<String> temp = new ArrayList<>();
            temp.add(curr);
            groupped.add(i);

            for(int j=i+1;j<strs.length;j++){
                String curr2=strs[j];
                if(!groupped.contains(j) && isAnagram(curr,curr2)){
                    temp.add(curr2);
                    groupped.add(j);
                }  
            }
            res.add(temp);
        
        }
        return res;
        
    }
    public boolean isAnagram(String a, String b){
        if(a.length()!=b.length()) return false;
        int freq[]=new int[26];
        for(char c:a.toCharArray()) freq[c-'a']++;
        for(char c:b.toCharArray()) freq[c-'a']--;
        for(int f: freq) if(f!=0) return false;
        return true;
    }
} */