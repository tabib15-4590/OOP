package Lab_Project;

import java.util.Scanner;
public class OpenACcount {

public void setInfo(int n){
    String[] info=new String[n];
    Scanner sc=new Scanner(System.in);
    System.out.println("\nGive us your personal Information:");

    System.out.print("Your Name: ");
    info[0]=sc.nextLine();

    System.out.print("\nFathers' Name: ");
    info[1]=sc.nextLine();

    System.out.print("\nMothers' Name: ");
    info[2]=sc.nextLine();

    System.out.print("\nYour age: ");
    info[3]=sc.nextLine();

    System.out.print("\nPhone Number: ");
    info[4]=sc.nextLine();

    System.out.print("\nNationality: ");
    info[5]=sc.nextLine();

    System.out.print("\nMarital Status: ");
    info[6]=sc.nextLine();

    System.out.print("\nHome District: ");
    info[7]=sc.nextLine();

    if(n==10){
        System.out.print("\nNominee Name: ");
        info[8]=sc.nextLine();

        System.out.print("\nNominee Phone Number: ");
        info[9]=sc.nextLine();

        System.out.println("\n\nPlease recheck your Information: ");

        System.out.println("\nName: "+info[0]);
        System.out.print("\nFathers' Name: "+info[1]);
        System.out.print("\nMothers' Name: "+info[2]);
        System.out.print("\nYour age: "+info[3]);
        System.out.print("\nPhone Number: "+info[4]);
        System.out.print("\nNationality: "+info[5]);
        System.out.print("\nMarital Status: "+info[6]);
        System.out.print("\nHome District: "+info[7]);
        System.out.print("\nNominee Name: "+info[8]);
        System.out.print("\nNominee Phone Number: "+info[9]);

        System.out.println("\n\nYour request is being processed.We will inform you later");

    }
    else if(n==11){
        System.out.print("\nName of your job sector: ");
        info[8]=sc.nextLine();

        System.out.print("\nAmount of your monthly salary: ");
        info[9]=sc.nextLine();

        System.out.print("\nWhat is your position: ");
        info[10]=sc.nextLine();

        System.out.println("\n\nPlease recheck your Information: ");

        System.out.println("\nName: "+info[0]);
        System.out.print("\nFathers' Name: "+info[1]);
        System.out.print("\nMothers' Name: "+info[2]);
        System.out.print("\nYour age: "+info[3]);
        System.out.print("\nPhone Number: "+info[4]);
        System.out.print("\nNationality: "+info[5]);
        System.out.print("\nMarital Status: "+info[6]);
        System.out.print("\nHome District: "+info[7]);
        System.out.print("\nName of your job sector: "+info[8]);
        System.out.print("\nAmount of your monthly salary: "+info[9]);
        System.out.print("\nWhat is your position: "+info[10]);


        System.out.println("\n\nYour request is being processed.We will inform you later");
    }

}
    public void savings(){
        setInfo(10);

    }
    public void salary(){
        setInfo(11);
    }

}


