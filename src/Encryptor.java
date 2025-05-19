public class Encryptor {
    public String encrypt(String content) {
        System.out.println("加密内容...");
        // 简单的加密算法 - 字符ASCII码加1
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char)(c + 1));
        }
        return encrypted.toString();
    }
}