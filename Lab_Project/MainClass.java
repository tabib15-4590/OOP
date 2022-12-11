package Lab_Project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        WelccomeTO_Bank w=new WelccomeTO_Bank();
        //Input  for help type open a/c,withdraw,others,exit
        int h=sc.nextInt();
        w.askingHelpType(h);

    }
}
