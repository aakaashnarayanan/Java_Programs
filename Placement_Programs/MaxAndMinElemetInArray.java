package placementPractice;

public class MaxAndMinElemetInArray {
	public static void main(String args[]) {
		int arr[] = { 98, 34, 1, 56, 3, 100 };
		int max = 0;
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
