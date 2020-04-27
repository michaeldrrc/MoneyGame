/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyGameFiles;

import java.io.BufferedWriter;
import java.nio.file.Path;
import java.io.*;
import javax.swing.JTextArea;

/**
 *
 * @author Derricm9485
 */
public class ScoresWrite {
    // The name of the file to open.

    private static final String READ_WRITE_FILENAME = "scores.txt";

    public ScoresWrite(String fileName) {
    }

    public static void read_file(JTextArea textArea) {

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(READ_WRITE_FILENAME);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                textArea.append(line + "\n");
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + READ_WRITE_FILENAME + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + READ_WRITE_FILENAME + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }

    }

    public static void write_file(String string_to_write) throws IOException {
        BufferedWriter f = null;
        try {
            f = new BufferedWriter(new FileWriter(READ_WRITE_FILENAME, true));
            //f.write("ABCDEFG");
            f.write(string_to_write);
            f.newLine();

            // Always close files.
            //bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (f != null) {
                f.close();
            }
        }
    }

}
