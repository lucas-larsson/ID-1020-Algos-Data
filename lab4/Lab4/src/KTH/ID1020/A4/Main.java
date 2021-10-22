package KTH.ID1020.A4;

import KTH.ID1020.Utility.DiBreadthFirstPaths;
import KTH.ID1020.Utility.DiSymbolGraph;
import java.util.Scanner;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-13
 * Description:
 **/
public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Where do you wanna start? ");
    String start = scan.next();
    System.out.println("Where are you going? ");
    String end = scan.next();
    DiSymbolGraph sg  = new DiSymbolGraph("KTH/ID1020/contiguous-usa.dat.txt", " " );
    DiBreadthFirstPaths dfs = new DiBreadthFirstPaths(sg.G(), sg.index(start));
    System.out.println(start + " to " + sg.name(sg.index(end)) + ": \n");
        if (dfs.hasPathTo(sg.index(end))) {
            System.out.println("YES, there is a path from: " +start+ " to " +end);
        }
        else {
            System.out.println(dfs.hasPathTo(sg.index(end)));
            System.out.println("No there is no a path from: " +start+ " to " +end);
        }
    }
}