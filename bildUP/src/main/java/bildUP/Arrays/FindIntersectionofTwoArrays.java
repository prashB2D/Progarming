package bildUP.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindIntersectionofTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,21,4,41,25};
		int b[]= {2,4,56,7,25};
		
//		inter1(a,b);
		inter2(a,b);

	}

	private static void inter2(int[] a, int[] b) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int A:a) {
			hm.put(A, hm.getOrDefault(A, 0)+1);
		}
		for(int B :b) {
			hm.put(B, hm.getOrDefault(B, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> mp:hm.entrySet()){
			if(mp.getValue()>1) {
				System.out.print(mp.getKey()+" ");
			}
		}
		
	}

	private static void inter1(int[] a, int[] b) {
		for(int A:a) {
			int key =A;
			for(int B:b) {
				if(B==key) {
					System.out.print(B+" ");
					break;
				}
			}
		}
		
		
	}

}
