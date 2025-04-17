class Solution {
    public boolean wordPattern(String pattern, String s) {
         String words[]=s.split("\\s+"); // split the string based on white spaces 
         HashMap<Character,String> mapPS= new HashMap<>();
         HashMap<String,Character> mapSP= new HashMap<>();

         int n=words.length;
         int m=pattern.length();
         if(n!=m){
            return false;
         }

         for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            String st=words[i];
            if(mapPS.containsKey(ch)){
                if(!mapPS.get(ch).equals(st)){  // we cant match like if ch!=st cuz In Java, != does reference comparison for objects (like String), not value comparison. So even if two strings have the same characters, != might still return true because they are different objects in memory.
                    return false;
                }
            }else{
                mapPS.put(ch,st);
            }

            if(mapSP.containsKey(st)){
                if(!mapSP.get(st).equals(ch)){ //!= applicable here but for the sake of readibility and less confusion ive opted this path
                    return false;
                }
            }else{
                mapSP.put(st,ch);
            }
         }

         return true;
    }
}