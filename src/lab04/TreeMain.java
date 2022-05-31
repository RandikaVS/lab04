package lab04;
import java.util.*;

public class TreeMain {

	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int empNo;
		Tree T1 = new Tree();
		
		T1.insert(149, "Anusha");
		T1.insert(167, "Kosala");
		T1.insert(047, "Dinusha");
		T1.insert(066, "Mihiri");
		T1.insert(159, "jayani");
		T1.insert(118, "Nimal");
		T1.insert(195, "Nishantha");
		T1.insert(034, "Avodya");
		T1.insert(105, "Bimali");
		T1.insert(133, "Sampath");
		
		System.out.println("InOrder(left,root,right)");
		T1.TraverserInOrder();
		System.out.println("");
		System.out.println("PreOrder(root,left,right)");
		T1.TraverserPreOrder();
		System.out.println("");
		System.out.println("PostOrder(left,right,loot)");
		T1.TraverserpostOrder();
		System.out.println("");
		T1.callRecursive(149);
		System.out.println("");
		
		while(true){
		System.out.println("");
		System.out.println("Enter 0 to terminate");
		System.out.print("Enter Emp No : ");
			empNo = myScanner.nextInt();
		
			try {

				System.out.println("Employee name is : "+T1.find(empNo).empName);
				
			}catch(Exception e) {
				System.out.println("Programme has terminated !!!");
				return;
			}
		
		}
	}

}
