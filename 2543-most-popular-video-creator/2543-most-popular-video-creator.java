class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String, Long> totalViews = new HashMap<>();
        Map<String, String> bestVideo = new HashMap<>();
        Map<String, Integer> bestVideoViews = new HashMap<>();

        int n = creators.length;

        for (int i = 0; i < n; i++) {
            String c = creators[i];
            String id = ids[i];
            int v = views[i];

            // total views
            totalViews.put(c, totalViews.getOrDefault(c, 0L) + v);

            // best video
            if (!bestVideo.containsKey(c)) {
                bestVideo.put(c, id);
                bestVideoViews.put(c, v); 
            } else {
                int currBest = bestVideoViews.get(c);
                String currId = bestVideo.get(c);
                if (v > currBest || (v == currBest && id.compareTo(currId) < 0)) {
                    bestVideo.put(c, id);
                    bestVideoViews.put(c, v);
                }
            }
        }

        // find max total views
        long maxViews = Collections.max(totalViews.values());

        // build answer
        List<List<String>> ans = new ArrayList<>();
        for (String c : totalViews.keySet()) {
            if (totalViews.get(c) == maxViews) {
                ans.add(Arrays.asList(c, bestVideo.get(c)));
            }
        }

        return ans;
    }
}
