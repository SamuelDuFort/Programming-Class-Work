package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*test case
        o:create account
          login
        i:login
        o:enter username:
        i:sam
        o:create account
          login
        i:create account
        o:enter username:
        i:samuel
        o:enter password:
        i:password
        o:create account
          login
        i:create account
        o:enter username:
        i:samuel
        o:sorry, please enter a different username:
        i:sam1
        o:enter password:
        i:password
        o:sorry, please enter a different password:
        i:8802
        o:create account
          login
        i:login
        o:enter username:
        i:sam
        o:create account
          login
        i:login
        o:enter username:
        i:sam1
        o:enter password:
        i:password
        o:sorry account does not match records
          create account
          login
        i:login
        o:enter username:
        i:samuel
        o:enter password:
        i:8802
        o:sorry account does not match records
          create account
          login
        i:login
        o:enter username:
        i:sam1
        o:enter password:
        i:8802
        o:welcome, sam1
        */
        Scanner console = new Scanner(System.in);

        ArrayList<String> usernameBank = new ArrayList<String>();
        ArrayList<String> passwordBank = new ArrayList<String>();

        while(true) {
            System.out.println("create account");
            System.out.println("login");
            String userInput = console.nextLine();

            if (userInput.equals("create account")) {
                System.out.println("enter username: ");
                String username = console.nextLine();
                int u = 0;
                while (u < usernameBank.size()) {
                    if (username.equals(usernameBank.get(u))) {
                        System.out.println("sorry, please enter a different username: ");
                        username = console.nextLine();
                        u = 0;
                    } else {
                        u = u + 1;
                    }
                }
                usernameBank.add(username);

                System.out.println("enter password: ");
                String password = console.nextLine();
                int p = 0;
                while (p < passwordBank.size()) {
                    if (password.equals(passwordBank.get(p))) {
                        System.out.println("sorry, please enter a different password: ");
                        password = console.nextLine();
                        p = 0;
                    } else {
                        p = p + 1;
                    }
                }
                passwordBank.add(password);
                System.out.println("your account has been created");
            }

            if (userInput.equals("login")) {
                System.out.println("enter username: ");
                String username = console.nextLine();
                int u = 0;
                while (u < usernameBank.size()) {
                    if (username.equals(usernameBank.get(u))) {
                        System.out.println("enter password: ");
                        String password = console.nextLine();
                        int p = 0;
                        while (p < passwordBank.size()) {
                            if (password.equals(passwordBank.get(p))) {
                                if (u == p) {
                                    System.out.println("welcome, " + username);
                                    System.exit(0);
                                } else {
                                    System.out.println("sorry account does not match records");
                                }
                            }
                            p = p + 1;
                        }
                    }
                    u = u + 1;
                }
            }
        }
    }
}
