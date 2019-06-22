package com.danasoft.objectmaster1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Wizard hatfield;
    private static Ninja mccoy;
    private static Samurai phillips;


    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        hatfield = new Wizard();
        mccoy = new Ninja();
        phillips = new Samurai();

        displayHumans();
        System.out.println("\r\n\tHatfield attacks McCoy!\r\n");
        hatfield.attack(mccoy);
        displayHumans();
        System.out.println("\r\n\tHatfield attacks Phillips!\r\n");
        hatfield.attack(phillips);
        displayHumans();
        System.out.println("\r\n\tPhillips attacks Hatfield!\r\n");
        phillips.attack(hatfield);
        displayHumans();
        System.out.println("\r\n\tMcCoy attacks Hatfield!\r\n");
        mccoy.attack(hatfield);
        displayHumans();
        System.out.println("\r\n\tHatfield heals himself!\r\n");
        hatfield.heal(hatfield);
        displayHumans();
        System.out.println("\r\n\tPhillips meditates!\r\n");
        phillips.meditate();
        displayHumans();
        System.out.println("\r\n\tHatfield fireballs McCoy!\r\n");
        hatfield.fireball(mccoy);
        displayHumans();
        System.out.println("\r\n\tMcCoy steals health from Phillips!\r\n");
        mccoy.steal(phillips);
        displayHumans();
        System.out.println("\r\n\tMcCoy runs away!\r\n");
        mccoy.runAway();
        displayHumans();
        System.out.println("\r\n\tPhillips deathBlows Hatfield!\r\n");
        phillips.dearhBlow(hatfield);
        displayHumans();
        System.out.printf("\r\n\tThere are %d Samurai in play!\r\n", Samurai.howMany());
        hatfield.heal(hatfield);
        displayHumans();

    }

    private static void displayHumans() {
        System.out.println(String.format("\r\n\tHatfield\r\n%s", hatfield.toString()));
        System.out.println(String.format("\r\n\tMcCoy\r\n%s", mccoy.toString()));
        System.out.println(String.format("\r\n\tPhillips\r\n%s", phillips.toString()));
        pressEnterToContinue(true);
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void pressEnterToContinue(boolean clr) {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        if (clr) clearScreen();
    }
}