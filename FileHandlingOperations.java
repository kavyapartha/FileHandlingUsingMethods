package FilesUsingProperties;

import java.io.*;

public class FileHandlingOperations{
    /**
     *
     *Creating a new File
     * @throws IOException
     */
    public static void createFile(String inputFile) throws IOException {
        File file = new File(inputFile);
        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }

    /**
     * Writing content into the file
     */
    public static void writeFile(String content, String inputFile) {
        try (FileWriter fileWriter = new FileWriter(inputFile)) {
            fileWriter.write(content);
            System.out.println("Content written successfully");
        } catch (IOException e) {
            System.err.println("Can't write to file: " + e.getMessage());
        }
    }

    /**
     *
     * @param inputFile
     * @param outputFile
     * Copying the content from one file to another
     */
    public static void copyFile(String inputFile, String outputFile) {
        File inputfile = new File(inputFile);
        File outputfile = new File(outputFile);
        try (FileReader fileReader = new FileReader(inputfile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(outputfile)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write(line + "\n");
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Can't write to the output file");;
        }
    }

}

