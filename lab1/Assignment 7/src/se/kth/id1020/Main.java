package se.kth.id1020;

import java.util.Scanner;
import java.io.*;
//Main method that runs the whole program
public class Main {

    public static void main(String[] args) {
        Stack <Character> stack = new  Stack<>();
        String input = insertFile ("parenthesesTrue.txt");

        System.out.println("results of the first test file should be true ");
        stack = new Stack<>();
        System.out.println(balanceCheck(stack,input));

        String input = insertFile ("parenthesesFalse.txt");

        System.out.println("results of the second test file should be false");
        stack = new Stack<>();
        System.out.println(balanceCheck(stack, input));



    }
    // input method that scanns input from external file
    public static String insertFile (String textFile){

        File file = new File ( "src.se.kth.id1020.ParenthesesTest/" + textFile);
        Scanner in = new Scanner(textFile);
        StringBuilder string = new StringBuilder();
        while ( in.hasNext()){      // brecks when hasNext == null
            String input = in.next();
            string.append(input);
        }
        in.close();
        return "";
    }
    // boolean method that tests if the parentheses are balanced or not
    // both time and space complexity are O(n), because the algorithm does not use extra storage besides n
    // and even in worst case scenario it goes throw the input n times.
    public static boolean balanceCheck(Stack <Character> stack, String input){

        for(int i= 0; i < input.length(); i++){
            char temp = input.charAt(i);
            if(temp == '[' || temp == '{' || temp == '('){
                stack.push(temp);
                continue;
            }
            if(stack.isEmpty()) return false;
            char closingChar;
            switch (temp) {
                case ')':
                    closingChar = stack.pop();
                    if (closingChar != '(')
                        return false;
                    break;
                case '}':
                    closingChar = stack.pop();
                    if (closingChar != '{')
                        return false;
                    break;
                case ']':
                    closingChar = stack.pop();
                    if (closingChar != '[')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
