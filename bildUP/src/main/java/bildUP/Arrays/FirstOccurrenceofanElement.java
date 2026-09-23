package bildUP.Arrays;

public class FirstOccurrenceofanElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 4, 4, 5, 6, 8};
        int target = 4;
        findF(arr ,target);

	}

	private static void findF(int[] arr, int target) {
		int st =0;
		int end =arr.length;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==target) {
				System.out.print(mid+" ");
				end=mid-1;
//				break;
			}else if (arr[mid]>target) {
				end=mid-1;
			}else {
				st=mid+1;
			}
		}
		
	}

}
