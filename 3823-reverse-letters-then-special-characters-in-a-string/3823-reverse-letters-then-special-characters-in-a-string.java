class Solution {
    public String reverseByType(String s) {
        List<Character> list = new ArrayList<>();
        List<Character> list2= new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                list.add(c);
            }else{
                 list2.add(c);
            }
        }
        Collections.reverse(list);
        Collections.reverse(list2);
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        for(char c: s.toCharArray()){
             if(Character.isLetter(c)){
                sb.append(list.get(i++));
             }else{
                sb.append(list2.get(j++));
             }
        }

        return sb.toString();

    }
}