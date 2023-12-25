import java.util.*;

class TreeNode<T extends Comparable<T>> {
	T element;
	TreeNode <T> left;
	TreeNode<T> right;
	public TreeNode(T o) {
		this.element = o;
		this.left = null;
		this.right = null;
	}
	public TreeNode() {
		this.element = null;
		this.left = null;
		this.right = null;
	}
	void insert(T a) {
		if (element.compareTo(a) < 0) {
			if (right == null) {
				right = new TreeNode<T>(a);
			} else {
				right.insert(a);
			}
		} else if (element.compareTo(a) > 0) {
			if (left == null) {
				left = new TreeNode<T>(a);
			} else {
				left.insert(a);
			}
		}
	}
	TreeNode delete (TreeNode root, T key) {
		if (root == null) {
			return root;
		}
		if (root.element.compareTo(key) > 0) {
			root.left = delete (root.left, key);
		} else if (root.element.compareTo(key) < 0) {
			root.right = delete (root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			root.element = inSucc(root.right);
			root.right = delete (root.right, this.element);
		}
		return root;
	}
	public T inSucc(TreeNode root) {
		T minv = this.element;
		while (root.left != null) {
			minv = this.left.element;
			root = root.left;
		}
		return minv;
	}
	public TreeNode search(T key) {
		if (this == null) {
			return null;
		} else{
			if (this.element.compareTo(key) == 0) {
				return this;}}
				if (this.element.compareTo(key) > 0) {
					if (this.left == null) {
						return null;
					}
						return this.left.search(key);
			
			} 
		
	
	else {
		if (this.right == null) {
			return null;
		}
		return this.right.search(key);
	}
	} 
public void search_result(T key){
    if(search (key)==null)
    { System.out.println("Not Found");
    }
    else {
        System.out.println(key + " : Found ");
        }
        }
     public   void inorder (TreeNode<T> R){
            if(R !=null){
                inorder (R.left);
                R.visit();
                inorder (R.right);
                }
                }
                	

public  void preorder(TreeNode<T> R){
    if(R != null){
        R.visit();
        preorder(R.left);
        preorder(R.right);
    }
}
public void postorder(TreeNode<T> R){
    if(R !=null){
        postorder(R.left);
        postorder(R.right);
        R.visit();
    }
}
public void visit(){
    System.out.print(this.element + " ");
}

}

 class Main {
	public static void main(String[] args) {
		TreeNode<String> ro = new TreeNode<String>("hello");
		
		ro.insert("hi");
		ro.insert("how are you");
		ro.insert("on");
		ro.postorder(ro);
	ro.delete(ro,"hi");
   	System.out.println();
   	ro.preorder(ro);
   	System.out.println();
   	ro.inorder(ro);
   	System.out.println();
   
   	ro.search_result("hello");
	}
}