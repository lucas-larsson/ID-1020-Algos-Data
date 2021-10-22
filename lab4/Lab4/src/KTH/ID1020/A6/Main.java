package KTH.ID1020.A6;

import KTH.ID1020.Utility.*;

import java.util.Scanner;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-13
 * Description:
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you wanna start? ");
        String start = scan.next();
        System.out.println("Where are you going? ");
        String end = scan.next();
        System.out.println(" mid station? ");
        String MID = scan.next();
        DiSymbolGraph sg  = new DiSymbolGraph("KTH/ID1020/NYC.txt", " " );
        DiBreadthFirstPaths beginning = new DiBreadthFirstPaths(sg.G(), sg.index(start));
        DiBreadthFirstPaths ending = new DiBreadthFirstPaths(sg.G(), sg.index(MID));
        System.out.println(start + " to " + sg.name(sg.index(end)) + ": \n");
        if (beginning.hasPathTo(sg.index(MID)) && ending.hasPathTo(sg.index(MID))) {
            int i = 1;
            for (int State : beginning.pathTo(sg.index(MID))) {
                System.out.println(i +": " + sg.name(State));
                i++;
            }
            for (int State : ending.pathTo(sg.index(end))) {
                if (State != sg.index(MID)) {
                    System.out.println(i + ": " + sg.name(State));
                    i++;
                }
            }
        } else {
            System.out.println("CANT FIND A PATH");
        }
    }
}