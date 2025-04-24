class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap <String,Integer>  map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<messages.length;i++){
            String name=senders[i];
            String message=messages[i];
            int count=1;
            for(int j=0;j<message.length();j++){
                if(message.charAt(j)==' '){
                    count++;
                }
            }
            map.put(name,map.getOrDefault(name,0)+count);
        }
        int highestFreq=Integer.MIN_VALUE;

        for(int val: map.values()){
            highestFreq=Math.max(val,highestFreq);
        }

        for(String key: map.keySet()){
            if(map.get(key)==highestFreq){
                return key;
            }
        }
        return "";

        
        
    }
}