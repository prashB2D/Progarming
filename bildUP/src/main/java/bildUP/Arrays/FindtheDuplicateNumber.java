package bildUP.Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 35, 3, 2, 4, 1, 3 };
		dupFind(a);
		
		Arrays.sort(a);
		dupFind2(a); // only works if the elements reapate obly 2 time if  not nope

	}

	private static void dupFind2(int[] a) {
		for(int i =0;i<a.length-1;i+=2) {
			if(a[i]==a[i+1]) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

	private static LinkedHashMap<Integer, Integer> dupFind(int[] a) {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
		for (int A : a) {
			lhm.put(A, lhm.getOrDefault(A, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> mp:lhm.entrySet()) {
			if(mp.getValue()>1) {
				System.out.print(mp.getKey()+"  ");
			}
		}
		System.out.println();

		return lhm;

	}

}
