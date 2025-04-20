class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n = queries.length;
        int m = words.length;
        int res[] = new int[n]; // ans would be equal to queries.length as we r calculating it only for queries.
        int freq1Arr[] = new int[queries.length];
        int freq2Arr[] = new int[words.length];

        for (int i = 0; i < n; i++) {
                String curr = queries[i];
                char minChar = curr.charAt(0);
                for (int j = 1; j < curr.length(); j++) {
                    if (curr.charAt(j) < minChar) {
                        minChar = curr.charAt(j);
                    }
                }
            
            int freq = 0;
            for (int k = 0; k < curr.length(); k++) {
                if (curr.charAt(k) == minChar) {
                    freq++;
                }
            }
                

            freq1Arr[i] = freq;
        }

        for (int i = 0; i < m; i++) {
            String curr2 = words[i];
            char minChar2 = curr2.charAt(0);
            for (int j = 1; j < curr2.length(); j++) {
                if (curr2.charAt(j) < minChar2) {
                    minChar2 = curr2.charAt(j);
                }
            }
            int freq2 = 0;
            for (int k = 0; k < curr2.length(); k++) {
                if (curr2.charAt(k) == minChar2) {
                    freq2++;
                }
            }

            freq2Arr[i] = freq2; 
        }

        for(int i=0;i<freq1Arr.length;i++){
            int curr=freq1Arr[i];
            int count=0;
            for(int j=0;j<freq2Arr.length;j++){
                if(freq2Arr[j]>curr){
                    count++;
                }
            }
            res[i]=count;
        }

        return res;

    }
}