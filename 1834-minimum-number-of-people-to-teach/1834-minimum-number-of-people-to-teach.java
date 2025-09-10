class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m=languages.length;
        List<Set<Integer>> knows= new ArrayList<>(); // to store which person knows which language, used set for easy loopkup, 1st perrson knows languages stored at 0th index
        for(int i=0;i<m;i++){
            Set<Integer> set = new HashSet<>();
            for(int lang : languages[i]){
                 set.add(lang);
            }
            knows.add(set);
        }  

        // now add problematic or non commutative friendships into the set , i.e the friendship that have no known common languages
        Set<Integer> mustFix= new HashSet<>();
        for(int f[]: friendships){
            int a= f[0]-1; // for 0 based indexing
            int b=f[1]-1;
             boolean canTalk=false;
            for(int lang: knows.get(a)){  // iterate over languages they know
               if(knows.get(b).contains(lang)){  // if any common then cantalk=true
                canTalk=true;
                break;
               }
            }
            if(!canTalk){
                mustFix.add(a);
                mustFix.add(b);
            }
        }

        if(mustFix.size()==0) return 0;

        // count frequecy of languages each prsn knows among the msutfix ppl
        int freq[]=new int[n+1];
        for(int person: mustFix){
            for(int lang: knows.get(person)){
                freq[lang]++;
            }
        }

        int maxKnown=0; // the most common language the problematic ppl know, so that we need to teach less ppl the new lang or one lang
        for(int f: freq){
            maxKnown=Math.max(maxKnown,f);
        }
        return mustFix.size()-maxKnown;
    }
}