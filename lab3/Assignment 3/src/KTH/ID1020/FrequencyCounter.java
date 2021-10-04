package KTH.ID1020;
import edu.princeton.cs.algs4.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Author:      lucasmacbookpro
 * Date:        2021-10-02
 * Description:
 **/
public class FrequencyCounter {
    public static Results  frequencyCounter (int args) throws IOException {
        BST<String, Integer> st = new BST<String, Integer>();
        File file = new File("src/KTH/ID1020/FilteredText.txt");
        FileReader fr = new FileReader(file);
        Scanner in = new Scanner(fr);
        int j = 0;
        for (int i = 0; i < 1000; i++) { // Build symbol table and count frequencies.
            String word = in.next().toLowerCase();
            if (word.length() < args) continue; // Ignore short keys.
            if (!st.contains(word)) st.put(word, 1);
            else st.put(word, st.get(word) + 1);
            //System.out.println(word);
            //System.out.println(j++);
        }
        // Find a key with the highest frequency count.
        String max = "";
        st.put(max, 0);
        for (String word : st.keys())
            if (st.get(word) > st.get(max))
                max = word;
            /*
        System.out.println("The most common word with ");
        System.out.println("Minimum Length: ["+args+"]");
        System.out.println("Word: \""+max +"\" ");
        System.out.println("Repetition Count: "+ st.get(max));
        */
        return new Results(args,max,st.get(max));
    }
}
