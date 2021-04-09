import java.util.Random;
import java.util.Scanner;

public class FrogGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean next = true;

        System.out.println("|============================|");
        System.out.println("|##WELCOME TO THE FROG GAME##|");
        System.out.println("|============================|");
        System.out.println("In this game you will guess on which stone the frogs comment");
        System.out.println("In this game the frog are described as *_*");

        run();

        System.out.println("next round(y/n)");
        if (scn.nextLine() == "n") {
            next = false;
        }
    }