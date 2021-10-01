package KTH.ID1020;
import java.io.*;
/**
 * Author:      LUCAS LARSSON.
 * Date:        2021-09-30
 * Description: a main class containing a filter method that takes in a txt file
 * and filters out and replace all (non-alphabetic characters, new line and space) with a space
 **/

class Main {
    private static boolean isAlpha(char c) {
        return Character.isLetter(c);
    }
    public static void main(String[] args) throws IOException {

        File file = new File("src/KTH/ID1020/98-0.txt");        // read from the file
        File outPutFile = new File("FilteredText.txt");         // create a file to write to
        FileWriter writer = new FileWriter( outPutFile);                 // initialize a writer and specify the destination
        try (FileReader fr = new FileReader( file ) ){
            int c;
            while ((c = fr.read()) != -1 ){
                if (isAlpha((char) c) || c == '\n' || c == ' ')
                    writer.write( c );
                else writer.write(' ');
            }
            /* writer.flush();             // not needed close() class flush as well ? eller? */
            writer.close();
        }
        catch (IOException e){           // Exception handling
            e.printStackTrace();
        }
    }
}