package KTH.ID1020.Utility;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-13
 * Description:
 **/
public class DiSymbolGraph {

    private ST<String, Integer> st;
    private String[] keys;
    private DiGraph G;

    public DiSymbolGraph(String stream, String dilimiter) {
        st = new ST<String, Integer>();
        In in = new In(stream);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(dilimiter);
            for (int i = 0; i < a.length; i++)
                if (!st.contains(a[i]) && i < 2){
                    //System.out.println(i);
                    //System.out.println(a[i]);
                    st.put(a[i], st.size());}
        }

        keys = new String[st.size()];
        for (String name : st.keys())
            keys[st.get(name)] = name;


        G = new DiGraph(st.size());
        in = new In(stream);
        while (in.hasNextLine()){
            String[] a = in.readLine().split(dilimiter);
            int v = st.get(a[0]);
            for (int i = 1; i < a.length; i++)
                G.addEdge(v, st.get(a[i]));
        }
    }
    public int index(String s)        {  return st.get(s);  }
    public String name(int v)         {  return keys[v];  }
    public DiGraph G()                  {  return G;  }
}
