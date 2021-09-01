/*
   UCF COP3330 Fall 2021 Assignment 1 Solution
   Copyright 2021 Jonathan Caques
 */
package exercise04;

import java.util.Scanner;

public class Solution04 {
    /*
        Print "Enter a noun: "
            Scanner input1 = new Scanner(System.in)
            String noun = input1.next()
        Print "Enter a verb: "
            Scanner input2 = new Scanner(System.in)
            String verb = input2.next()
        Print "Enter an adjective: "
            Scanner input3 = new Scanner(System.in)
            String adjective = input3.next()
        Print "Enter an adverb: "
            Scanner input4 = new Scanner(System.in)
            String adverb = input4.next()
        Print output, ("The" adjective + noun + adverb + verb ".") --Example
     */
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
            Scanner input1 = new Scanner(System.in);
            String noun = input1.next().toLowerCase();

        System.out.print("Enter a verb: ");
            Scanner input2 = new Scanner(System.in);
            String verb = input2.next().toLowerCase();

        System.out.print("Enter an adjective: ");
            Scanner input3 = new Scanner(System.in);
            String adjective = input3.next().toLowerCase();

        System.out.print("Enter an adverb: ");
            Scanner input4 = new Scanner(System.in);
            String adverb = input4.next().toLowerCase();

        System.out.println("The " + adjective + " " + noun + " wanted to " + adverb + " " + verb + " the clock at work to go home early.");
    }
}
