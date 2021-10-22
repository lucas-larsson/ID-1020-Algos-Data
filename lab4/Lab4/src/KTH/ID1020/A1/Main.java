package KTH.ID1020.A1;

import KTH.ID1020.Utility.SymbolGraph;
import java.util.Scanner;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-13
 * Description: A Main Class
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Where do you wanna start? ");
        String start = scan.next();
        System.out.println(" where do u wanna go? ");
        String end = scan.next();
        SymbolGraph sg  = new SymbolGraph("KTH/ID1020/contiguous-usa.dat.txt", " " );
        DepthFirstPaths dfs = new DepthFirstPaths(sg.G(), sg.index(start));
        System.out.println(start + " to " + sg.name(sg.index(end)) + ": \n");
        if (dfs.hasPathTo(sg.index(end))) {
            int i = 1;
            for (int STATE : dfs.pathTo(sg.index(end))){
                System.out.println(i + ": " + sg.name(STATE));
                i++;
            }
        }
    }
}