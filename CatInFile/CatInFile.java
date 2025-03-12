import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        String filePath = args[0]; 

        try (InputStream inputStream = System.in;
             OutputStream outputStream = new FileOutputStream(filePath)) { 
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            return;
        }
    }
}