package KTH.ID1020;
import edu.princeton.cs.algs4.*;

import java.io.*;
import java.util.Scanner;


/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-01
 * Description: A slightly altered version of the FrequencyCounter from page 372 from the course literature
 **/
public class FrequencyCounter {

    public static Results  frequencyCounter (int args) throws IOException {
        BinarySearchST<String, Integer> st = new BinarySearchST<>();
        File file = new File("src/KTH/ID1020/FilteredText.txt");
        FileReader fr = new FileReader(file);
        Scanner in = new Scanner(fr);
        int j = 0;
        for (int i = 0; i < 1000; i++) {                    // Build symbol table and count frequencies.
            String word = in.next().toLowerCase();          // Lower case so that we can calculate all the words of the same type
            if (word.length() < args) continue;             // Ignore short keys.
            if (!st.contains(word)) st.put(word, 1);
            else st.put(word, st.get(word) + 1);
        }
        // Find a key with the highest frequency count.
        String max = "";
        st.put(max, 0);
        for (String word : st.keys())
            if (st.get(word) > st.get(max))
                max = word;
        System.out.println("The most common word with ");
        System.out.println("Minimum Length: ["+args+"]");
        System.out.println("Word: \""+max +"\" ");
        System.out.println("Repetition Count: "+ st.get(max));

        return new Results(args,max,st.get(max));
    }
}