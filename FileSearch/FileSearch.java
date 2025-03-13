import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        // Chemin du dossier "documents" à la racine du dossier courant
        File documentsFolder = new File("documents");

        // Lancer la recherche récursive
        return searchFileRecursive(documentsFolder, fileName);
    }

    // Méthode récursive pour rechercher le fichier
    private static String searchFileRecursive(File directory, String fileName) {
        if (directory == null || !directory.isDirectory()) {
            return null; // Si le dossier n'existe pas ou n'est pas un dossier, retourner null
        }

        // Parcourir les fichiers et sous-dossiers du dossier courant
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Si c'est un sous-dossier, rechercher récursivement
                    String result = searchFileRecursive(file, fileName);
                    if (result != null) {
                        // Construire le chemin relatif en ajoutant le nom du sous-dossier
                        return directory.getName() + "/" + result;
                    }
                } else if (file.isFile() && file.getName().equals(fileName)) {
                    // Si c'est le fichier recherché, retourner le chemin relatif
                    return directory.getName() + "/" + file.getName();
                }
            }
        }

        return null; // Si le fichier n'est pas trouvé, retourner null
    }
}