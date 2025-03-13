import java.io.*;
import java.nio.file.*;

public class FileManager {

    // Crée un fichier avec un nom et un contenu donnés
    public static void createFile(String fileName, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content); // Écrire le contenu dans le fichier
        }
    }

    // Récupère le contenu d'un fichier
    public static String getContentFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n"); // Ajouter la ligne au contenu
            }
        }
        return content.toString();
    }

    // Supprime un fichier
    public static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName)); // Supprimer le fichier s'il existe
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }
}