import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main_05 {
	public static void main(String[] args) {
		String path = "/path/to/dir";

		try (DirectoryStream<Path> ds = Files.newDirectoryStream(
				FileSystems.getDefault().getPath(path), Files::isDirectory)) {
			for (Path p : ds) {
				System.out.println(p.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}