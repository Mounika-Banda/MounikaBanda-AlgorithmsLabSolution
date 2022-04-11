package CurrencyDenominations.Services;

public class SortCurrnecyDenomination {

	public void sortCurrencyDenominations(int[] arrayTobeSorted, int start, int end) {

		if (start < end) {
			int pivot = arrayPartition(arrayTobeSorted, start, end);
			sortCurrencyDenominations(arrayTobeSorted, start, pivot - 1);
			sortCurrencyDenominations(arrayTobeSorted, pivot + 1, end);
		}
	}

	public  int arrayPartition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = (start - 1);
		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
				i++;
				int swap = array[i];
				array[i] = array[j];
				array[j] = swap;
			}
		}
		// Swapping the elements
		int swap = array[i + 1];
		array[i + 1] = array[end];
		array[end] = swap;
		return i + 1;
	}

}
