import java.io.IOException;

public class FileEncryptFacade {
    private FileReader fileReader;
    private Encryptor encryptor;
    private FileWriter fileWriter;

    public FileEncryptFacade() {
        this.fileReader = new FileReader();
        this.encryptor = new Encryptor();
        this.fileWriter = new FileWriter();
    }

    public void encryptFile(String sourcePath, String destPath) throws IOException, IOException {
        // 1. 读取文件
        String content = fileReader.readFile(sourcePath);

        // 2. 加密内容
        String encryptedContent = encryptor.encrypt(content);

        // 3. 写入文件
        fileWriter.writeFile(destPath, encryptedContent);

        System.out.println("文件加密完成!");
    }
}