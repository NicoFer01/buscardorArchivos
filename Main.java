import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String path = "/path/to/dir";

		File file = new File(path);
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isDirectory();
			}
		});

		System.out.println(Arrays.toString(directories));
	}
}