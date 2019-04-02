package notesForClass;

import java.util.Scanner;

public class passCode {

    public String myCode() {
        //Create a Scanner object
        Scanner username = new Scanner(System.in);

        System.out.println("Enter username");

        //reads user inputs
        String userName = username.nextLine();

        System.out.println("Username is: " + userName);
        //_________________________________________________

        // scanner for password and unassign string for do while loop
        Scanner password = new Scanner(System.in);
        String passWord;


        //attempt object
        int numAttempts = 0;
        int count = 1;


        // do while loop with if else loop to limit possibilities
        do {
            System.out.println("Enter Password" + "\t" + count);
            passWord = password.nextLine();
            numAttempts++;
            count = count + 1;


        }

        while (!"TGIF".equals(passWord) && numAttempts < 5);
        {

            if (passWord.equals("TGIF")) {
                System.out.println("You Logged In Sucessfully");
            } else {
                System.out.println("You are locked out. Contact the system admin");
            }
            return myCode();

        }

    }

}




