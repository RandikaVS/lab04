package lab04;

public class TreeNode {
	
	public String empName;
	public int empNo;
	
	public TreeNode leftChild;
	public TreeNode rightChild;

	public TreeNode() {
		
	}
	
	public void displayNode() {
		System.out.print("Emp No : "+this.empNo);
		System.out.print(" , ");
		System.out.println("Emp Name : "+this.empName);
	}

}
