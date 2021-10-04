package KTH.ID1020;
import edu.princeton.cs.algs4.*;

import java.io.*;
import java.util.Scanner;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-03
 * Description: a Counter method from the book altered to work for this assignment
 * the method builds a table and count the frequency of a specific word in text.
 * page 372
 **/
class WordCounter {
    public static SeparateChainingHashST wordCounter() throws FileNotFoundException {
        SeparateChainingHashST<String, Integer> ht = new SeparateChainingHashST<>();
        File file = new File("src/KTH/ID1020/FilteredText.txt");
        FileReader fr = new FileReader(file);
        Scanner fileScanner = new Scanner(fr);
        while(fileScanner.hasNext()){
            String key = fileScanner.next().toLowerCase();
            if (ht.contains(key)) {
                ht.put(key, ht.get(key) + 1);
            } else {
                ht.put(key, 1);
            }
        }
        return ht;
    }
}