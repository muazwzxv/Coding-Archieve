import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Journal {
	private final List<String> entries = new ArrayList<String>();
	private static int count = 0;

	public void add(String data) {
		entries.add("" + (++count) + ": " + data);
	}

	public void remove(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), this.entries);
	}

	/**
	 * 
	 * These methods below are considered a violation of the single responsibility
	 * rules due to the class not just responsible of managing the journal, but
	 * managing also the persistent of journal and retrieving of the journal
	 * 
	 * 
	 * To solve this and follow the respective pattern, separation of concern should
	 * be done and other class should handle the concern of reading and persisting
	 * of data
	 * 
	 * 
	 * Solution for this in ./Storage.java
	 */

	public void save(String filename) throws FileNotFoundException {
		try (PrintStream out = new PrintStream(filename)) {
			out.println(toString());
		}
	}

	public void load(String filename) {
	}
}
