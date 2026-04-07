package functions;

public class practice {
	public static void main(String[] args) { 
		byte[] nums1 = new byte[] {2, 4, 6};
		
		int summ1 = summaArray(nums1);
		System.out.println("1: " + summ1);
		
		byte[] nums2 = new byte[] {3,6,4,2,6,7};
		
		int summ2 = summaArray(nums2);
		System.out.println("2: " + summ2);
	}
	
	public static int summaArray(byte[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		} return sum;
	}
}
