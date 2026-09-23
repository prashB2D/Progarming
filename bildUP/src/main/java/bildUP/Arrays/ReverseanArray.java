package bildUP.Arrays;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		rev(a);

	}

	private static void rev(int[] a) {
		int i =0;
		int end=a.length-1;
		while(i<end) {
			int t=a[i];
			a[i]=a[end];
			a[end]=t;
			i++;
			end--;
		}
		Arrays.stream(a).forEach(v->System.out.print(v+" "));
		
	}

}
