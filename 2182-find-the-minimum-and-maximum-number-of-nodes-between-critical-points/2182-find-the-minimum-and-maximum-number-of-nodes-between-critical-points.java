/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
         // first we need to ge the indices of all the critical points present in the linked list
         // as there must be nodes on each side of the node to consider it to chekc wether it is a local maxima or minima

         int n=0;
         ListNode t=head;
         while(t!=null){
            t=t.next;
            n++;
         }
         if(n<=2){
            return new int[]{-1,-1};
         }
         ArrayList<Integer> criticalIndices= new ArrayList<>(); // list to store all the critical inidces

         ListNode prev=head;
         int i=1; // as we start from head.next
         ListNode curr=head.next;

         while( curr.next!=null){
            if(prev.val < curr.val && curr.next.val < curr.val){  // local maxima
                criticalIndices.add(i);
            }
            if(prev.val>curr.val && curr.next.val > curr.val){  // local minima
                criticalIndices.add(i);
            }
            i++;
            prev=curr;
            curr=curr.next;
         }

         // now list has the indices of local maximas and minimas
         int res[]=new int[2];

        // the list is always sroted, so max distance would be diff between first and last element
        int k=criticalIndices.size();
        if(k<2){  // if fewer than 2 critcal points then no max or monditance between them
          return new int[]{-1,-1};
        }else{
            res[1]=criticalIndices.get(k-1)-criticalIndices.get(0);  // max would be last-first

             int minDistance=Integer.MAX_VALUE;
            for (int j = 1; j <k ; j++) { 
            minDistance = Math.min(minDistance, criticalIndices.get(j) - criticalIndices.get(j - 1));
            res[0]=minDistance;  // would exist between consecutive char only as the list is by default sorted 

        }
 
        }
        return res;

    }
}

/**
Can also be computed on go
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int index = 1;
        int first = -1, last = -1;
        int prevCritical = -1;
        int minDistance = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {
            if ((prev.val < curr.val && curr.val > curr.next.val) ||
                (prev.val > curr.val && curr.val < curr.next.val)) {

                if (first == -1) {
                    first = index;
                } else {
                    minDistance = Math.min(minDistance, index - prevCritical);
                }

                prevCritical = index;
                last = index;
            }

            index++;
            prev = curr;
            curr = curr.next;
        }

        if (first == last || first == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, last - first};
    }
}
 */