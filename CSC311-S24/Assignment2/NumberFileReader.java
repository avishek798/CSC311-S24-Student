import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NumberFileReader {

	private String fName;

	public NumberFileReader(String fName) {
		this.fName = fName;
	}

	public int[] read() throws IOException {
		int lines = 0;

		BufferedReader counter = new BufferedReader(new FileReader(this.fName));

		while (counter.readLine() != null) {
			lines++;
		}

		counter.close();

		BufferedReader br = new BufferedReader(new FileReader(this.fName));

		int[] numArray = new int[lines];
		int index = 0;
		String line;
		while ((line = br.readLine()) != null) {
			numArray[index] = Integer.parseInt(line.trim());
			index++;
		}

		br.close();
		return numArray;

	}

}
