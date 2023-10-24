package project;
import java.util.Scanner;
import static project.Arrayoperations.*;

public class ArraysUserOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element" + (i + 1));
			a[i] = sc.nextInt();
		}
		boolean flag = true;
		while (flag) {
			System.out.println("\n 1.Insert \n 2.Delete \n 3.Update \n 4.FirstOcuurence"
					+ "\n 5,LastOccurrence \n 6.sort" + "\n 7.Reverse \n 8.Merge \n 9.Max \n 10.Min \n 11.Display"
					+ "\n 12.Clear \n 13.Size\n 14.isEmpty \n 15.Exit \n ");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: {
				System.out.println("Enter new element");
				int ele = sc.nextInt();
				System.out.println("Enter position to insert");
				int pos = sc.nextInt();
				a = insert(a, ele, pos);
				display(a);
				break;
			}
			case 2: {
				System.out.println("Enter deleting element");
				int del = sc.nextInt();
				a = delete(a, del);
				display(a);
				break;
			}
			case 3: {
				System.out.println("Enter the new element");
				int new_ele = sc.nextInt();
				System.out.println("Enter replacing element");
				int old_ele = sc.nextInt();
				update(a, new_ele, old_ele);
				display(a);
				break;
			}
			case 4: {
				System.out.println("Enter search element");
				int ele = sc.nextInt();
				int ind = firstoccur(a, ele);
				if (ind == 1)
					System.out.println("Element is not present");
				else
					System.out.println("Element is present at:" + (ind + 1));
				break;
			}
			case 5: {
				System.out.println("Enter search element");
				int ele = sc.nextInt();
				int ind = lastoccur(a, ele);
				if (ind == 1)
					System.out.println("Element is not present");
				else
					System.out.println("Element is present at:" + (ind + 1));
				break;
			}
			case 6: {
				sort(a);
				display(a);
				break;
			}
			case 7: {
				a = reverse(a);
				display(a);
				break;
			}
			case 8: {
				System.out.println("Enter array size");
				int size1 = sc.nextInt();
				int b[] = new int[size1];
				for (int i = 0; i < size1; i++) {
					System.out.println("Enter element" + (i + 1));
					b[i] = sc.nextInt();
				}
				a = merge(a, b);
				display(a);
				break;
			}
			case 9: {
				System.out.println("Maximum element is :" + max(a));
				break;
			}
			case 10: {
				System.out.println("Minimum element is:" + min(a));
				break;
			}
			case 11: {
				display(a);
				break;
			}
			case 12: {
				a = clear();
				break;
			}
			case 13: {
				System.out.println(a.length);
				break;
			}
			case 14: {
				if (isEmpty(a))
					System.out.println("Array is Empty");
				else
					System.out.println("Array is not Empty");
				break;
			}
			case 15: {
				flag = false;
				break;
			}
			default: {
				System.out.println("Choose the correct option");
			}

			}
		}
	}

}
