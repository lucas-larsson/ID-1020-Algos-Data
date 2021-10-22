package KTH.ID1020.Utility;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-13
 * Description:
 **/
 public class SymbolGraph {
    private ST<String, Integer> st;
    private String[] keys;
    private Graph G;
    public SymbolGraph(String stream, String delimiter) {
        st = new ST<String, Integer>();
        In in = new In(stream);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(delimiter);
            for (String s : a)
                if (!st.contains(s))
                    st.put(s, st.size());
        }
        keys = new String[st.size()];
        for (String name : st.keys())
            keys[st.get(name)] = name;
        G = new Graph(st.size());
        in = new In(stream);
        while (in.hasNextLine()){
            String[] a = in.readLine().split(delimiter);
            int v = st.get(a[0]);
            for (int i = 1; i < a.length; i++)
                G.addEdge(v, st.get(a[i]));
        }
    }
    public int index(String s)        {  return st.get(s);  }
    public String name(int v)         {  return keys[v];  }
    public Graph G()                  {  return G;  }
}
