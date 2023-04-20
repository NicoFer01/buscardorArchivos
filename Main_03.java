import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main_03 {
	public static void main(String[] args) {
		String path = "/path/to/dir";

		File[] directories = new File(path).listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});

		System.out.println(Arrays.toString(directories));
	}
}