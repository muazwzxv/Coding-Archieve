import java.io.FileNotFoundException;

public class Storage {
	public void save(Journal j, String filename, boolean overwrite) throws FileNotFoundException {
		if (overwrite || new File(filename).exists()) {
			try (PrintStream out = new PrintStream(filename)) {
				out.println(toString());
			}
		}
	}

	public void load(String filename) {
	}

	public void load(URL url) {
	}
}
