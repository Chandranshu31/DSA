class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int sal:salary){
            sum+=sal;
        }
        for(int num:salary){
            max=Math.max(num,max);
            min=Math.min(num,min);
        }
        int updated=sum-max-min;
        double updatedLength=salary.length-2.0;
        return updated/updatedLength;
    }
}