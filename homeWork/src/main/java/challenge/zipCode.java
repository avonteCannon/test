package challenge;

import java.util.Scanner;

public class zipCode {

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();

        public void zipNumberBoy (){
            if (a % 5 == 0 && a % 3 == 0) {
                System.out.println("ZIP CODE");
            } else if (a % 5 == 0) {
                System.out.println("CODE");
            } else if (a % 3 == 0) {
                System.out.println("ZIP");
            } else {
                System.out.println("error");
            }
        }

    }