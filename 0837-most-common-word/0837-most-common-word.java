class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");// case insensitive so ball and Ball r same to normalize just conver the whole paragrapgh into lowercase and replace all non letters with whitespaces
        String words[]=paragraph.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String b: banned){
            set.add(b);
        }
        int maxFreq=Integer.MIN_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            if(!set.contains(curr)){
                map.put(curr,map.getOrDefault(curr,0)+1);
                maxFreq=Math.max(maxFreq,map.get(curr));
            }
        }
        StringBuilder res= new StringBuilder();
        for(String p: map.keySet()){
            if(map.get(p)==maxFreq){
                res.append(p);
                break;
            }
        }

        return res.toString();

    }
}