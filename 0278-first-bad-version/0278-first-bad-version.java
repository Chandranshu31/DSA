/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1;
        int j=n;
        while(i<j){
            int mid=i+(j-i)/2;
            if(isBadVersion(mid)){  // if mid is bad version then we need to find a version which is msaller than mid so that we get the first bad version
                j=mid;
            }else {
                i=mid+1;
            }
        }
        return i;
        
        
        
    }
}