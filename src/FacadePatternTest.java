import java.io.IOException;

public class FacadePatternTest {
    public static void main(String[] args) {
        FileEncryptFacade facade = new FileEncryptFacade();

        String sourceFile = "test.txt";
        String encryptedFile = "encrypted.txt";

        try {
            // 创建测试文件
            java.nio.file.Files.write(
                    java.nio.file.Paths.get(sourceFile),
                    "Hello, this is a test file!".getBytes()
            );

            System.out.println("开始文件加密...");
            facade.encryptFile(sourceFile, encryptedFile);

            System.out.println("\n原始文件内容:");
            System.out.println(new String(java.nio.file.Files.readAllBytes(
                    java.nio.file.Paths.get(sourceFile))));

            System.out.println("\n加密后文件内容:");
            System.out.println(new String(java.nio.file.Files.readAllBytes(
                    java.nio.file.Paths.get(encryptedFile))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}