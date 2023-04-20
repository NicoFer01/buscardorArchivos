import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main_06 {
	public static void main(String[] args) throws IOException {
		String path = "/path/to/dir";

		List<Path> dirs = Files.walk(Paths.get(path), 1)
				.filter(Files::isDirectory)
				.collect(Collectors.toList());

		System.out.println(dirs);
	}
}