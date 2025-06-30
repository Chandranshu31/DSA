class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // convert the 2d matrix rep of edges into adjacency list
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();

        for(int i=0;i<n;i++){ // for n numb of vertices
            graph.add(new ArrayList<>());
        }
        for(int edge[]: edges){
            int u=edge[0];
            int v= edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }


      boolean vis[]= new boolean[graph.size()];
        return hasPath(graph,source,destination,vis);
     
        
    }

    public boolean hasPath(ArrayList<ArrayList<Integer>> graph, int source, int destination, boolean vis[]){
        if(source==destination){
            return true;
        }

        vis[source]=true;// mark it visited
           // iterate over its neighbour if unvisisted and check wether there is path from neighbour to dest
        for(int i=0;i<graph.get(source).size();i++){
            int neighbour = graph.get(source).get(i);

            if(!vis[neighbour] && hasPath(graph,neighbour,destination,vis)){
                return true;
            }
        
        }
        return false;
    }
}