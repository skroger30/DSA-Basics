
public class KadanesAlgo {

	public static void main(String[] args) {
		 
		int arr[]= {10,-5,6,-7,1,-3,8};
	System.out.println(maxSubArraySum(arr));	

	}

	private static int maxSubArraySum(int[] arr) {
		
		int maxSum = arr[0];
		int maxEnding = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			maxEnding = Math.max( maxEnding+ arr[i], arr[i]);
			maxSum = Math.max(maxEnding, maxSum);
		}
		return maxSum;
	}

}
