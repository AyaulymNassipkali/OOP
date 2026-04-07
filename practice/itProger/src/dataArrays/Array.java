package dataArrays;

public class Array {
	public static void main(String[] args) {
	int[] nums = new int[5];
	nums[0] = 45;
	nums[1] = 23;
	nums[2] = 54;
	nums[3] = 65;
	nums[4] = 67;
	int res = nums[1] + nums[4];
	System.out.println(nums[0]);
	
	float[] nums2 = new float[] {5.0f, 6.45f, 89.892f};
	System.out.println(nums2[1]);
	
	
	for(int i=0; i<nums2.length; i++) {
		System.out.println("Element: " + nums2[i]);
	}
	}
}
