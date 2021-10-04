package KTH.ID1020;

import java.io.*;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-03
 * Description: a  Main class that calls a Frequency Counter
 * to measure the distortion of javas built in hashCode() function
 * and print it to an external file to save the data
 **/
public class Main {

    public static void main(String[] args) throws IOException {

        int[]  hashArray = FrequencyCounter.frequencyCounterST();

        File outFile = new File("src/KTH/ID1020/OutPutFiles/hashData.csv");
        try (FileWriter fw = new FileWriter(outFile);) {
            for (int j : hashArray) {
                fw.write(j+"\n");
                System.out.println(j);
            }
        }
    }
}