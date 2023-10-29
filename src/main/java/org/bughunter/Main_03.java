package org.bughunter;

import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperature? ");
        int numDays = console.nextInt();
        int[] temp = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            temp[i] = console.nextInt();
            sum += temp[i];
        }
        double average = (double) sum / numDays;
        int above = 0;
        for (int i = 0; i < temp.length; i++){
            if (temp[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average temp = " + average);
        System.out.println(above + " days above average.");
    }
}
