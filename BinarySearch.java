package Session6;

public class BinarySearch {

	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + ((r - l) / 2);
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946 };
		int x = 55;
		int result = binarySearch(arr, 0, arr.length, x);
		if (result == -1)
			System.out.println("Element does not exist");
		else
			System.out.println("Element found at index " + result);
	}
}
