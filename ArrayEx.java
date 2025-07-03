package day8;
import java.util.*;
public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		// getting elements from user
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		// printing the elements from user
		System.out.println("Printing the elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
