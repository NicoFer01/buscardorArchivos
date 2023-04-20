import java.io.File;
import java.util.Arrays;

public class Main_02 {
	public static void main(String[] args) {
		String path = "/path/to/dir";

		File file = new File(path);
		String[] directories = file.list((dir, name) -> new File(dir, name).isDirectory());
		System.out.println(Arrays.toString(directories));
	}
}