import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void writeFile(String filePath, String content) throws IOException {
        System.out.println("写入文件: " + filePath);
        Files.write(Paths.get(filePath), content.getBytes());
    }
}