package placementPractice;

public class ReversingArray {

	static void reverseArr(int arr[], int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			--end;
		}
		printArr(arr);
	}

	static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = 5;

		reverseArr(arr, start, end);

	}

}
