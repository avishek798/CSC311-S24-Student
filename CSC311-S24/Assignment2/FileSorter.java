import java.util.Scanner;
import java.io.IOException;

public class FileSorter {

	public static void main(String[] args) throws IOException {

		Scanner mxMech = new Scanner(System.in);

		System.out.print("Enter Name of Input File: ");
		String inputFName = mxMech.nextLine();

		NumberFileReader reader = new NumberFileReader(inputFName);

		BubbleSort sorter = new BubbleSort(reader.read());

		System.out.print("Enter Name of Output File: ");
		String outputFName = mxMech.nextLine();

		NumberFileWriter writer = new NumberFileWriter(outputFName);

		writer.write(sorter.sortDesc());
		mxMech.close();

	}

}
