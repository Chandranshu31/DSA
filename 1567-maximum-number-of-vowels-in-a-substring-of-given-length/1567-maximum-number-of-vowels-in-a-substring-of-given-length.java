class Solution {
    public int maxVowels(String s, int k) {
        int maxNumb=0;
        int n=s.length();
        for(int i=0;i<k;i++){   // check  the number of vowels in the first window, and make it the curr maxnumb
            if(isVowel(s.charAt(i))){
                maxNumb++;
            }
        }
        int count=maxNumb; // asssign the curr count as maxnumb
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){  // is the char going out of this window ws vowel decrease the count , currcount
                count--;
            }
            if(isVowel(s.charAt(i))){  // if the element coming in window is vowel increment the count
                count++;
            }
            maxNumb=Math.max(count,maxNumb);  // keep updating the maxnumb after every iteration

        }

        return maxNumb;
    }

    public boolean isVowel(char ch){  // fucn to check if a char is vowel or not
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}