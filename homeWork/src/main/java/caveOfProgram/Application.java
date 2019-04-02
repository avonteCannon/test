package caveOfProgram;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //video 4
        int value = 0;
        while(value < 10)
        {
            System.out.println("Wavy " + value);
            value = value + 1;
        }
        // video 5
        for(int i=0; i<10; i++)
        {
            System.out.printf("The value of i is: %d\n", i);
        }
        //video 6
        int myInt = 22;
        if(myInt < 20){
            System.out.println("Yes");
        }
        else if(myInt > 10){
            System.out.println("NO");
        }
        else{
            System.out.println("NONE OF THE ABOVE");
        }
        //video 7
        //created scanner object
        Scanner input = new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter a floating point value");

        //Waiting for user to enter something
        double amount = input.nextDouble();

        //Tell them what they entered
        System.out.println("You entered: " + amount);

        //video 8




    }
}
