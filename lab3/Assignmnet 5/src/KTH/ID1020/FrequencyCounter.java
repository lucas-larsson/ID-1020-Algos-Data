package KTH.ID1020;
import edu.princeton.cs.algs4.*;


import java.io.*;
import java.util.Scanner;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-03
 * Description: a  FrequencyCounter class that count the distribution frequency of javas hashCode() function
 * this class is from the course literature book page 372, altered a little to work with this assignment
 **/
public class FrequencyCounter {

    public static int [] frequencyCounterST () throws IOException {
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<>();
        File file = new File("src/KTH/ID1020/FilteredText.txt");
        FileReader fr = new FileReader(file);
        Scanner in = new Scanner(fr);

        while (in.hasNext()) { // Build symbol table and count frequencies.
            String word = in.next().toLowerCase();
            if(st.contains(word)){
                st.put(word, st.get(word) + 1);
            }
            else{
                st.put(word,1);
            }
        }
        in.close();
        int i = 0;
        int [] hashArray= new int[st.size()];
        System.out.println(st.size());

            for (String key : st.keys()) {
                hashArray[i++] =(st.hashTextbook(key));
            }
        return hashArray;
    }


    public static int getHashValue(String s, int hashSize) {
        return (s.hashCode() & 0x7fffffff) % hashSize;
    }
}
