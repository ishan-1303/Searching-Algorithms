package SearchingAlgorithm;

public class Search {
	public int linearSearch(int[] a, int key) // linear search algorithm
	{
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				return i; // returns position where key is found
			}
		}
		return -1; // if key is not found it returns -1
	}

	public int binarySearch(int[] a, int key, int start, int end) // binary search algorithm
	{ // returns the position of searched element
		if (end >= start) {
			int mid;

			mid = start + (end - start) / 2;

			if (a[mid] == key)
				return mid;

			if (a[mid] > key)
				return binarySearch(a, key, start, mid - 1);

			return binarySearch(a, key, mid + 1, end);
		}
		return -1;
	}
}
