class FoodRatings {
    public HashMap<String,String> foodToCuisine;
    public HashMap<String,Integer> foodToRating;
    HashMap<String, TreeSet<String>> cuisineToFood;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating= new HashMap<>();
        cuisineToFood= new HashMap<>();
        for(int i=0;i<foods.length;i++){
            String food=foods[i];
            String cuisine= cuisines[i];
            int rating=ratings[i];

            foodToCuisine.put(food,cuisine);
            foodToRating.put(food,rating);

            cuisineToFood.putIfAbsent(cuisine, new TreeSet<>(( a, b) -> {
                int rateA=foodToRating.get(a);
                int rateB=foodToRating.get(b);
                if(rateA!=rateB) return rateB-rateA; // the greater one
                return a.compareTo(b); //lexicographic tie-break if rating smae return smaller one lexicographically
            }
            ));
            
            cuisineToFood.get(cuisine).add(food);
        }
        
    }
    
    public void changeRating(String food, int newRating) {
          String cuisine = foodToCuisine.get(food);

        // Remove old entry from TreeSet
        cuisineToFood.get(cuisine).remove(food);

        // Update rating
        foodToRating.put(food, newRating);

        // Reinsert with new rating (TreeSet will reorder)
        cuisineToFood.get(cuisine).add(food);
        
    }
    
    public String highestRated(String cuisine) {
         return cuisineToFood.get(cuisine).first();
        
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */