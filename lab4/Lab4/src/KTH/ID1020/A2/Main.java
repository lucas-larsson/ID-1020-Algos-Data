package KTH.ID1020.A2;

import KTH.ID1020.Utility.SymbolGraph;
import java.util.Scanner;
/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-13
 * Description: a main class to run the program.
 **/
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you wanna start?? ");
        String start = scan.next();
        System.out.println("Where do u wanna go? ");
        String end = scan.next();
        SymbolGraph sg  = new SymbolGraph("KTH/ID1020/contiguous-usa.dat.txt", " " );

        BreadthFirstPaths dfs = new BreadthFirstPaths(sg.G(), sg.index(start));
        System.out.println(start + " to " + sg.name(sg.index(end)) + ": \n");
        if (dfs.hasPathTo(sg.index(end))) {
            int i = 1;
            for (int place : dfs.pathTo(sg.index(end))){
                System.out.println(i + ": " + sg.name(place));
                i++;
            }
        }
    }
}

