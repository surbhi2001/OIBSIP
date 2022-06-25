package com.Java;
import java.util.Scanner;

public class ATM_Interface {
        public static void main(String args[] )
        {
            int balance = 100000, withdraw, deposit;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your credentials.");
            System.out.print("Enter Login ID:");
            String lid=sc.nextLine();
            System.out.print("Enter Pin:");
            String pin=sc.nextLine();
            if(lid.equals("Username") && pin.equals("7894"))
            {
                while(true)
                {
                    System.out.println("Welcome to ATM");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Deposit");
                    System.out.println("3. Transfer");
                    System.out.println("4. Check Balance");
                    System.out.println("5. QUIT");
                    System.out.print("Choose the operation you want to perform:");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter money to be withdrawn:");
                            withdraw = sc.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                            } else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                        }
                        case 2 -> {
                            System.out.print("Enter money to be deposited:");
                            deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("");
                        }
                        case 3 -> {
                            System.out.print("Enter Receiver's Bank Account Number: ");
                            int rac = sc.nextInt();
                            System.out.print("Enter Amount to be transferred: ");
                            int amttransfer = sc.nextInt();
                            if (amttransfer <= balance) {
                                System.out.println("Amount Successfully transferred.");
                                balance = balance - amttransfer;
                            } else {
                                System.out.println("You don't have enough balance in your account.");
                            }
                            System.out.println("");
                        }
                        case 4 -> {
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                        }
                        case 5 -> System.exit(0);
                    }
                }
            }
            else
            {
                System.out.println("Wrong Credentials");
            }
        }
    }

