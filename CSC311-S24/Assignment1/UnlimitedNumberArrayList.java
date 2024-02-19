
public class UnlimitedNumberArrayList {

	private int[] numArray;
	private int size = 0;

	public UnlimitedNumberArrayList() {
		numArray = new int[5]; // default size is considered to be 5

	}

	public int add(int number) {

		spaceCheck(size + 1);
		numArray[size] = number;
		return size++;
	}

	private void spaceCheck(int spaceRequired) {

		if (spaceRequired <= numArray.length) {
			return;
		}

		int newLimit = numArray.length * 2;

		if (newLimit < spaceRequired) {
			newLimit = spaceRequired;
		}

		int[] tempArray = new int[newLimit];
		for (int i = 0; i < size; i++) {
			tempArray[i] = numArray[i];
		}

		numArray = tempArray;

	}

	public int get(int index) {
		if (index >= 0 && index < size) {
			return numArray[index];
		} else
			throw new ArrayIndexOutOfBoundsException("Error. Invalid Index: " + index + " out of bounds!");
	}

	public int size() {
		return size;
	}

	public int[] find(int number) {
		int[] temp = new int[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (numArray[i] == number) {
				temp[count] = i;
				count++;
			}

		}
		int[] indices = new int[count];

		System.arraycopy(temp, 0, indices, 0, count);

		return indices;
	}

	public int getLargest() {
		if (size == 0) {
			return -1;
		}

		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {
			if (numArray[i] > largest) {
				largest = numArray[i];
			}
		}
		return largest;
	}

	public int getSmallest() {
		if (size == 0) {
			return -1;
		}

		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < size; i++) {
			if (numArray[i] < smallest) {
				smallest = numArray[i];
			}
		}
		return smallest;
	}

	public int getAverage() {
		if (size == 0) {
			return -1;
		}

		int sum = 0;

		for (int i = 0; i < size; i++) {

			sum += numArray[i];

		}

		return sum / size;

	}

	public String toString() {

		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			sb.append(numArray[i]).append(", ");
		}

		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");

		return sb.toString();
	}

}
