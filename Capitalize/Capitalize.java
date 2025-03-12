import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }
        String inputPath = args[0];
        String outputPath = args[1];

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                
                String capitalizedLine = capitalizeLine(line);
                bw.write(capitalizedLine);
                bw.newLine();
            }
        }
    }

    private static String capitalizeLine(String input) {
        String[] words = input.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalized.toString().trim();
    }
}