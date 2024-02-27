
public class BubbleSort {

	private int[] numArray;
	private int loopCycles;

	public BubbleSort(int[] array) {
		this.numArray = array.clone();
		this.loopCycles = 0;

	}

	public int[] sortAsc() {
		boolean swapped;
		int arrLength = numArray.length;
		loopCycles = 0;

		do {
			swapped = false;
			for (int i = 0; i < arrLength - 1; i++) {
				if (numArray[i] > numArray[i + 1]) {
					int tmp = numArray[i];
					numArray[i] = numArray[i + 1];
					numArray[i + 1] = tmp;
					swapped = true;
				}
			}
			arrLength--;
			loopCycles++;
		} while (swapped);

		return numArray;
	}

	public int[] sortDesc() {
		boolean swapped;
		int arrLength = numArray.length;
		loopCycles = 0;

		do {
			swapped = false;
			for (int i = 0; i < arrLength - 1; i++) {
				if (numArray[i] < numArray[i + 1]) {
					int tmp = numArray[i];
					numArray[i] = numArray[i + 1];
					numArray[i + 1] = tmp;
					swapped = true;
				}
			}
			arrLength--;
			loopCycles++;
		} while (swapped);

		return numArray;
	}

	public int loopCycles() {
		return this.loopCycles;
	}

}
