package KTH.ID1020;

import edu.princeton.cs.algs4.BST;

import java.io.*;
import java.util.Scanner;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-03
 * Description: a frequencyCounter method copied from the book page 372
 * altered to work with this assignment
 **/
class FrequencyCounter {
    public static BST wordCounter(int args) throws FileNotFoundException {
        BST<String, Integer> st = new BST<>();
        File file = new File("src/KTH/ID1020/FilteredText.txt");
        FileReader fr = new FileReader(file);
        Scanner in = new Scanner(fr);

        for (int i = 0; i < args; i++) {
            String word = in.next().toLowerCase();
            if (!st.contains(word)) st.put(word, 1);
            else st.put(word, st.get(word) + 1);
        }
        return st;
    }
}
