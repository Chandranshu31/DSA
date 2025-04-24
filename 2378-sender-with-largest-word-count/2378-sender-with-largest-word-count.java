class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap <String,Integer>  map = new TreeMap<>(Collections.reverseOrder());  // to get the lexographically larger names at top so the momnet we match the highest freq we return it in case of same freq count
        for(int i=0;i<messages.length;i++){
            String name=senders[i];
            String message=messages[i];
            int count=1;  // to count the number of words the string has
            for(int j=0;j<message.length();j++){
                if(message.charAt(j)==' '){ //  B C D, initllay count=1... 3 spaces--count=4 and thats the final also
                    count++;
                }
            }
            map.put(name,map.getOrDefault(name,0)+count); // map the name with the total word count they have sent
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