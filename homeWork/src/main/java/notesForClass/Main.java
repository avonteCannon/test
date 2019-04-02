package notesForClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //PERSON HOMEWORK
        Person robo1 = new Person();
        System.out.println(robo1);

        Person robo2 = new Person(22, "Avonte'", "Track", 20000, "Graphic Designer");
        System.out.println(robo2.aboutMyLife());

        //TWO NUMBER INPUT
        Scanner Number1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1;
        num1 = Number1.nextInt();

        Scanner Number2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        double num2;
        num2 = Number2.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(num1 * num1);
        System.out.println("Math.cos(" + num1 + ")=" + Math.cos(num1));
        System.out.println("Math.sin(" + num1 + ")=" + Math.sin(num1));

        //PASSWORD HOMEWORK
        Scanner username = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = username.nextLine();
        System.out.println("Username is: " + userName);

        Scanner password = new Scanner(System.in);
        String passWord;

        int numAttempts = 0;
        int count = 1;

        do {
            System.out.println("Enter Password" + "\t" + count);
            passWord = password.nextLine();
            numAttempts++;
            count = count + 1;
        }
        while (!"PIZZAPALACE".equals(passWord) && numAttempts < 5);
        {
            if (passWord.equals("PIZZAPALACE")) {
                System.out.println("YOUR LOGGED IN MY BOY");
            }
            else {
                System.out.println("ERROR! ERROR!. YOUR LOCKED OUT SUCKA");
            }

        }
        //CHAPTER 3 HOMEWORK
        //MAGNET JUMBULE
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 6;
        index[3] = 8;
        //islands array (Elements)
        String [] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azoros";
        islands[3] = "Cozumel";
        int y = 0;
        int space;
        while (y<4){
            space = index[y];
            System.out.println(islands[space]);
            y = y + 1;
        }

        String x = "will I AM";
        int h = 99;
        System.out.println(h + "x");




    }
}