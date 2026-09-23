package bildUP.Arrays;

import java.util.Arrays;

public class MoveAllZeroestotheEnd {

	public static void main(String[] args) {
		int a[]= {1,0,2,0,34,53,0,4};
		placeZero(a);

	}

	private static void placeZero(int[] a) {
		int ppint=0;
		for(int i =0;i<a.length;i++) {
			if(a[i]!=0) {
				int t=a[i];
				a[i]=a[ppint];
				a[ppint]=t;
				ppint++;
			}
		}
		
		Arrays.stream(a).forEach(v->System.out.print(v+" "));
		
	}

}
