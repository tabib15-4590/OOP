package Lab_Project;

import java.util.Scanner;

public class Withdraw extends OpenACcount{
    Scanner sc=new Scanner(System.in);
    public void setInfo(){

        System.out.println("\nGive your account information\n");
        System.out.print("Account Number: ");
        String acNO=sc.nextLine();
        System.out.print("\nAccount Holder Name: ");
        String holder=sc.nextLine();
        System.out.print("\nVerification Code(sent to your ac phone number): ");
        int otp=sc.nextInt();
        System.out.print("\nHow much money You want to withdraw: ");
        int money=sc.nextInt();
        System.out.println("\n\nYour request is being process\n");

    }
}
