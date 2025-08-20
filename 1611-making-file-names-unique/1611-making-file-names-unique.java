class Solution {
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map = new HashMap<>();
        String res[]= new String[names.length];

        res[0]=names[0];
        map.put(names[0],1);

        for(int i=1;i<names.length;i++){
            String curr=names[i];
            if(!map.containsKey(curr)){
                res[i]=curr;
                map.put(curr,1);
            }else{
                int  k = map.get(curr);
                String newName = curr + "(" + k + ")";
                while (map.containsKey(newName)) {  // keep incrementing bracket value and changing nrwname unitl the new name also exists in the map
                    k++;
                    newName = curr + "(" + k + ")";
                }
                res[i] = newName;
                map.put(curr, k + 1);    // update base name’s counter (next available suffix starts at next, to avoid redundent chekcs), like if gta comes again it holds val=3 that is we dont need to check for gta1 gta2 n all
                map.put(newName, 1);
            }
        }
        return res;
    }
}