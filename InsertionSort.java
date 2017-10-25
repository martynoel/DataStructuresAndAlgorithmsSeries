public class InsertionSort {

	public static int[] insertionSort(int[] array) {

		int interationNumber = 0;

		for (int i = 0; i < array.length; i++) {

			interationNumber++;

			for (int j = i; j > 0; j--) {

				if ( array[j] < array[j-1]) {

					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}

			System.out.println(" ");
			System.out.print("Iteration " + interationNumber + ": ");

			for (int b = 0; b < array.length; b++) {
				System.out.print(array[b] + " ");
			}
		}

		return array;

	}

	public static void main(String[] args) {

		int[] testArray = {15, 8, 5, 14, 25, 1, 3};
		insertionSort(testArray);
	}
}
