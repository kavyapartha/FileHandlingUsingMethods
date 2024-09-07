package FilesUsingProperties;

import java.io.*;
import java.util.Properties;

public class InputFiles {
    Properties properties;
    String inputFile;
    String outputFile;

    /**
     *
     * @param propertiesFilePath
     */

    public InputFiles(String propertiesFilePath) {
        properties = new Properties();
        loadProperties(propertiesFilePath);
    }

    /**
     *
     * @param propertiesFilePath
     * Accessing the valuef from properties file
     * using the keys in properties file
     */
    public void loadProperties(String propertiesFilePath) {
        try (FileReader fileReader = new FileReader(propertiesFilePath)) {
            properties.load(fileReader);
            inputFile = properties.getProperty("inputFile1");
            outputFile = properties.getProperty("outputFile1");
        } catch (IOException e) {
            System.err.println("Can't read the properties file: ");
        }
    }

    /**
     *
     * @return file from where the content need to be copied
     */

    public String getInputFile() {
        return inputFile;
    }

    /**
     *
     * @return file to where the content need to be copied
     */
    public String getOutputFile() {
        return outputFile;
    }
}
