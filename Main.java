package com.package1;

public class Main {

    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
 // Loops for printing TELUSKO
            for (int j=1;j<=5;j++){
                if (i==1 || j==3)                 //for printing T
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){               //for printing E
                if (i==1 || i==3 || i==5 || j==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){               //for printing L
                if (j==1 || i==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){               //for printing U
                if (j==1 || j==5 || i==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){               //for printing S
                if (i==1 || i==3 || i==5 || (i==2&&j==1) || (i==4&&j==5))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){               //for printing K
                if (j==5&&(i==1||i==5) || (j==4&&(i==2||i==4)) ||(j<=3&&i==3) || j==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){               //for printing O
                if (i==1 || i==5 || j==1 || j==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
 // Loops for printing INEURON
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i==1||i==5 || j==3)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){
                if (j==1||j==5 || (i==2 && j==2)||(i==3 && j==3)||(i==4&&j==4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){
                if (i==1||i==3||i==5||j==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){
                if (j==1||j==5||i==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){
                if (j==1||i==1||i==3||(i==2&&j==5)||(i==5&&j==5)||(i==4&&j==4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){
                if (i==1||i==5||j==1||j==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int space=1;space<=3;space++)
                System.out.print(" ");
            for (int j=1;j<=5;j++){
                if (j==1||j==5||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
