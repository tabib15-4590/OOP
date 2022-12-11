package Lab_Project;

import java.util.Scanner;

public  class WelccomeTO_Bank {

    private int helptype;
    Withdraw w = new Withdraw();

    OpenACcount o = new OpenACcount();

    public WelccomeTO_Bank() {
        System.out.println("WELCOME TO PRIME BANK. What kind of help do you want ?\n");
        System.out.println("If you want to,");
        System.out.println("\n (a) open a new Account then press '1'.");
        System.out.println("\n (b) Withdraw money then press '2'.");
        System.out.println("\n (c)Others press '3'.");
        System.out.println("\n (d)Exit press '0'");

        System.out.println("\n\n(Note: Only Numerical Item is accepted)");
        System.out.print("\n\nPress the key= ");
    }

    public void askingHelpType(int h) {
        this.helptype = h;

        if (helptype == 1) {
            System.out.println("\nWhat type of account you want to open?");
            System.out.println("\nAccount type:\n  (1) Savings then press- '1'");
            System.out.println("\n  (2) Salary accout then press '2'");
            System.out.println("\n  (3)Exit press-'0'");
            System.out.print("\nPress the key: ");

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            if (n == 1) {
                o.savings();
            }

            else if (n == 2) {
                o.salary();
            }

            else if (n == 0) {

            }

        }
        else if(helptype==2){
            w.setInfo();
        }

        else if(helptype==3){
            Others ot=new Others();
            ot.notice();
        }


        else if(helptype==0){
            System.out.println("\nThank you for using PRIME Bank");

        }
        else{
            throw new ArithmeticException("\n\nYou press a wrong key. Please press between 1-3 and 0.Thank You\n\n");
        }



    }


}
