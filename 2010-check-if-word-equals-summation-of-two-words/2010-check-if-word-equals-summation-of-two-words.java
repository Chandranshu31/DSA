class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder a= new StringBuilder();
        for(char ch:firstWord.toCharArray()){
            int dig=ch-'a';
            a.append(dig);
        }
         StringBuilder b= new StringBuilder();
        for(char ch:secondWord.toCharArray()){
            int dig=ch-'a';
            b.append(dig);
        }

         StringBuilder c= new StringBuilder();
        for(char ch:targetWord.toCharArray()){
            int dig=ch-'a';
            c.append(dig);
        }

        return( getNumerical(a.toString())+getNumerical(b.toString())==getNumerical(c.toString()) );
        
    }
    public int getNumerical(String s){
        return Integer.parseInt(s);
    }
}