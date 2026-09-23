package bildUP.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3, 0, 1}; // N = 3, missing 2
        System.out.println("Missing Number: " + findMissingSum(nums));

	}

	private static int findMissingSum(int[] nums) {
		int n=nums.length;
		int exptSum=n*(n+1)/2;
		int actualSum=0;
		for(int A:nums) {
			actualSum+=A;
		}
		return exptSum-actualSum;
	}

}
