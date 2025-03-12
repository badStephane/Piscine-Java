import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0){
            return;
        } 
        String filePath = args[0];
        File f = new File(filePath);

        if(!f.exists()){
            return;
        }

        try(InputStream inputStream = new FileInputStream(f)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            return;
        }

    }
}