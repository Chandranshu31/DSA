import java.util.*;

public class Solution {
    static int[] par;
    static int[] rank;

    public static void init(int n){
        par = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    public static int find(int x){
        if(x == par[x]) return x;
        return par[x] = find(par[x]);  // Path Compression
    }

    public static void union(int a, int b){
        int parA = find(a);  // FIX: use find here
        int parB = find(b);

        if(parA == parB) return;

        if(rank[parA] < rank[parB]){
            par[parA] = parB;
        } else if(rank[parA] > rank[parB]){
            par[parB] = parA;
        } else {
            par[parB] = parA;
            rank[parA]++;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        init(n);
        for(int[] edge : edges){
            union(edge[0], edge[1]);
        }
        return find(source) == find(destination);
    }
}
