import java.util.*; 

class node{
	int data;
	node left;
	node right;
}

class BinaryTree{
	public node createNewNode(int val) {
		node a=new node();
		a.data=val;
		a.left=null;
		a.right=null;
		return a;
	}
}


public class BinaryTreeBasic {
	
	public static void preorder(node root) {
	       if(root == null) {
	           System.out.print(-1+" ");
	           return;
	       }
	       System.out.print(root.data+" ");
	       preorder(root.left);
	       preorder(root.right);
	   }
	public static void inorder(node root) {
	       if(root == null) {
	           System.out.print(-1+" ");
	           return;
	       }
	       inorder(root.left);
	       System.out.print(root.data+" ");
	       inorder(root.right);
	   }
	public static void postorder(node root) {
	       if(root == null) {
	           System.out.print(-1+" ");
	           return;
	       }
	       postorder(root.left);
	       postorder(root.right);
	       System.out.print(root.data+" ");
	   }
	public static void levelOrder(node root) {
	       if(root == null) {
	           return;
	       }
	       Queue<node> q = new LinkedList<>();
	       q.add(root);
	       q.add(null);
	       while(!q.isEmpty()) {
	           node curr = q.remove();
	           if(curr == null) {
	               System.out.println();
	               //queue empty
	               if(q.isEmpty()) {
	                   break;
	               } else {
	                   q.add(null);
	               }
	           } else {
	               System.out.print(curr.data+" ");
	               if(curr.left != null) {
	                   q.add(curr.left);
	               }
	               if(curr.right != null) {
	                   q.add(curr.right);
	               }
	           }
	       }
	   }
	
	public static int height(node root) {
	       if(root == null) {
	           return 0;
	       }
	 
	       int leftHeight = height(root.left);
	       int rightHeight = height(root.right);
	       return Math.max(leftHeight, rightHeight) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		node root=bt.createNewNode(2);
		root.left=bt.createNewNode(7);
		root.right=bt.createNewNode(5);
		root.left.left=bt.createNewNode(2);
		root.left.right=bt.createNewNode(6);
		root.left.left.left=bt.createNewNode(1);
		root.left.left.right=bt.createNewNode(3);
		root.right.left=bt.createNewNode(4);
		root.right.right=bt.createNewNode(9);
		System.out.println(bt);
		System.out.println("Preorder traversal");
		preorder(root);
		System.out.println();
		System.out.println("Inorder traversal");
		inorder(root);
		System.out.println();
		System.out.println("Postorder traversal");
		postorder(root);
		System.out.println();
		System.out.println("Levelorder traversal");
		levelOrder(root);
		System.out.println();
		System.out.println("Height of the tree:"+height(root));
		
	}

}
