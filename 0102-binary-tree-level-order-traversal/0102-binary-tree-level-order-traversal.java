class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();

        if (root == null) {
            return ans; 
        }

        queue.offer(root); 

        while (!queue.isEmpty()) {
            int n = queue.size(); 
            List<Integer> s = new LinkedList<Integer>(); 

            for (int i = 0; i < n; i++) {
                TreeNode peek = queue.poll(); 
                s.add(peek.val); 

                if (peek.left != null) { 
                    queue.offer(peek.left);
                }
                if (peek.right != null) { 
                    queue.offer(peek.right);
                }
            }
            ans.add(s); 
        }
        return ans;
    }
}