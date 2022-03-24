package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        int cnt = input.nextInt();
        switch (cnt){
            case 1:
                for (int i =0;i<5;i++){
                    System.out.println("");
                    for(int j =0;j<5;j++){
                        System.out.print(" * ");
                    }
                }
            case 2:
                for (int i=0;i<5;i++){
                    System.out.println("");
                    for (int j =0; j<=i;j++){
                        System.out.print(" * ");
                    }
                }
                for (int i=0;i<5;i++){
                    System.out.println("");
                    for (int j =1; j<=i;j++){
                        System.out.print("   ");
                    }
                    for (int j =5; j>i;j--){
                        System.out.print(" * ");
                    }
                }
                for (int i=0;i<5;i++){
                    System.out.println("");
                    for (int j =4; j>i;j--){
                        System.out.print("   ");
                    }
                    for (int j =0; j<=i;j++){
                        System.out.print(" * ");
                    }
                }
                for (int i=0;i<5;i++){
                    System.out.println("");
                    for (int j =0; j<5-i;j++){
                        System.out.print(" * ");
                    }
                    for (int j =5; j>=i;j--){
                        System.out.print("   ");
                    }
                }
            case 3:
                for (int i=0;i<=3;i++){
                    System.out.println("");
                    for (int j =0 ;j<=6 ;j++){
                        if(j>=(6-2*i)/2&&j<=(6+0.5*i)/2){
                            System.out.print(" * ");
                        }
                        System.out.print("   ");
                    }
                }
            case 4:
                System.exit(0);
        }
    }
}
