import java.io.File;
import java.util.Arrays;

public class Main_04 {
	public static void main(String[] args) {
		String path = "/path/to/dir";

		File[] directories = new File(path).listFiles(File::isDirectory);
		System.out.println(Arrays.toString(directories));
	}
}