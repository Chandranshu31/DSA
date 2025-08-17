class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        StringBuilder aux= new StringBuilder();

        for(char ch: date.toCharArray()){
            if(ch!='-'){
                aux.append(ch);
            }else{
                int val= Integer.parseInt(aux.toString());
                sb.append(Integer.toBinaryString(val));
                sb.append('-');
                aux.setLength(0);
            }
        }
         int val= Integer.parseInt(aux.toString());   // for the date last one. cuz we never reach - at teh end and loops ends with auz having the date data
                sb.append(Integer.toBinaryString(val));
        

        return sb.toString();
        
    }
}

// in temp builder keep adding number until we reach -
// the moment we reach -.. get the string in buff to int value
// append it to sb by converting integer value into binary string