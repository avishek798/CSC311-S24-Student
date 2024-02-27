import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NumberFileWriter {

	private String fName;

	public NumberFileWriter(String fName) {
		this.fName = fName;

	}

	public void write(int[] arrayOfNumbers) throws IOException {

		PrintWriter writer = new PrintWriter(new FileWriter(this.fName));

		for (int x : arrayOfNumbers) {
			writer.println(x);
		}

		writer.flush();
		writer.close();
	}

}
