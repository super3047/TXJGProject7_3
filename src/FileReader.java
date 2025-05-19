import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public String readFile(String filePath) throws IOException {
        System.out.println("读取文件: " + filePath);
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}