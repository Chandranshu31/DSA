/*→ `"2,4,#,#,#"`

- As we traverse the tree:
- Serialize each subtree.
- Store its frequency in a map.
- If the frequency becomes 2, it means we found a **duplicate subtree**, so we add it to the result list.

---

## ✅ Correct Code
```java
*/
class Solution {
  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
      List<TreeNode> result = new ArrayList<>();
      Map<String, Integer> map = new HashMap<>();
      serialize(root, map, result);
      return result;
  }

  private String serialize(TreeNode node, Map<String, Integer> map, List<TreeNode> result) {
      if (node == null) return "#"; // null marker

      // serialize this subtree
      String serial = node.val + "," + serialize(node.left, map, result) + "," + serialize(node.right, map, result);

      // count frequency
      map.put(serial, map.getOrDefault(serial, 0) + 1);

      // add to result if found exactly twice (to avoid duplicates in list)
      if (map.get(serial) == 2) {
          result.add(node);
      }

      return serial;
  }
}
