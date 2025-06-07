class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String log: logs){
            if(log.equals("../")){
                if(count>0) count--; // because if already at the main foldeer then we cant go back to its parent as there is not any 
            }
            else if(log.equals("./")){  // stay in same folder
                continue;
            }
            else{
                count++;  // go to the next folder
            }
        }
        return count; // how far u r from the main folder 
    }
}
