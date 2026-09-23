package bildUP.Arrays;

import java.util.HashMap;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		int a[]= {1,23,3,4,6,7,9,5};
		int sum=9;
		findSum(a, sum);

	}

	private static void findSum(int[] a, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0;i<a.length;i++) {
			int need=sum-a[i];
			if(hm.containsKey(need)) {
				System.out.println(i+" "+hm.get(need));
				break;
			}else {
				hm.put(a[i], i);
			}
		}
		
	}

}
