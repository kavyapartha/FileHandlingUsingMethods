package FilesUsingProperties;

import java.io.IOException;

class FileHandling{
    public static void main(String[] args) throws IOException {
        /**
         * Setting the location for creating the files
         */
        String propertiesFilePath = "src/FilesUsingProperties/input.properties";
        InputFiles inputFiles = new InputFiles(propertiesFilePath);
        String inputFile1 = inputFiles.getInputFile();
        String outputFile1 = inputFiles.getOutputFile();
        FileHandlingOperations.createFile(inputFile1);
        String content = "Hello to all the Veevans \nThis is kavya medharametla";
        FileHandlingOperations.writeFile(content,inputFile1);
        FileHandlingOperations.copyFile(inputFile1, outputFile1);

    }
}