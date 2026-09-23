package bildUP.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromaSortedArray {

	public static void main(String[] args) {
		int a[]= {2,4,2,3,24,56,3,5,34,6};
		Arrays.sort(a);
//		dupRem1(a); // by collection
		
		
		dupRem2(a);

	}
c
	private static void dupRem2(int[] a) {
		int j=0;
		for(int i =1;i<a.length+1;i++) {
			if(a[i]!=a[j]) {}
			j++;
			a[i]=a[j];
				
			}
		}
		
	

	private static void dupRem1(int[] a) {
		Set<Integer> s = new HashSet<Integer>();
		for(int A:a) {
			s.add(A);
		}
		
		// to collection to array its hard to convert " only way you can is "create new array okey by using size to knwo "
		for(int A:s) {
			System.out.print(A+" ");
		}
		
	}

}
