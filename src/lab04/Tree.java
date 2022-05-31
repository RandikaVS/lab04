package lab04;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int empNo,String empName) {
		TreeNode newNode = new TreeNode();
		
		newNode.empName=empName;
		newNode.empNo=empNo;
		
		if(root == null) {
			root = newNode;
			return;
			
		}else {
			TreeNode current = root;
			TreeNode parent;
			
			while(true) {
				parent=current;
				
				if(empNo<current.empNo) {
					current = current.leftChild;
					
					if(current==null) {
						parent.leftChild=newNode;
						return;
					}
				}
				else {
					current=current.rightChild;
					if(current==null) {
						parent.rightChild=newNode;
						return;
					}
				}
				
			}
		}
	}
	
	private void inOrder(TreeNode LocalRoot) {
		
		if(LocalRoot != null) {
			inOrder(LocalRoot.leftChild);
			LocalRoot.displayNode();
			inOrder(LocalRoot.leftChild);
		}
	}
	
	public void TraverserInOrder() {
		inOrder(root);
	}
	
	private void preOrder(TreeNode LocalRoot) {
		
		if(LocalRoot != null) {
			LocalRoot.displayNode();
			preOrder(LocalRoot.leftChild);
			preOrder(LocalRoot.rightChild);
		}
	}
	
	public void TraverserPreOrder() {
		preOrder(root);
	}
	
	private void postOrder(TreeNode LocalRoot) {
		if(LocalRoot !=null) {
		postOrder(LocalRoot.leftChild);
		postOrder(LocalRoot.rightChild);
		LocalRoot.displayNode();
		}
	}
	
	public void TraverserpostOrder() {
		postOrder(root);
	}
	
	private TreeNode findRecursive(TreeNode LocalRoot,int empNo) {
		
		if(LocalRoot == null) {
			System.out.print("Value is not in the Tree !!");
			return null;
		}
		else if(LocalRoot.empNo == empNo) {
			System.out.println(LocalRoot.empName);
			return LocalRoot;
		}
		else if(empNo<LocalRoot.empNo) {
			return findRecursive(LocalRoot.leftChild,empNo);
		}
		else {
			return findRecursive(LocalRoot.rightChild,empNo);
		}
	}
	
	public void callRecursive(int empNo) {
		findRecursive(root,empNo);
	}
	
	
	
	public TreeNode find(int empNo) {
		
		TreeNode current = root;
		
		while(current.empNo != empNo) {
			
			if(empNo<current.empNo) {
				current = current.leftChild;
			}
			else {
				current = current.rightChild;
			}
			if(current==null) {
				System.out.println("Value is not in the Tree !!");
				return null;
			}
			
			
		}
		System.out.println(current.empName);
		return current;
	}

}
