package Day10;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int day = (int)(Math.random() * 6 + 1);
        int day = 8;
        // int random = 7;
        System.out.println(day);
        //case is like a if statment
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                default:
                    System.out.println("What planet you from");
                    break;

        }

        String[] array = new String[3];

        array[0] = "Mango";
        array[1] = "Apple";
        array[2] = "Watermelon";

        for (String element : array){

            System.out.println(element);
        }

        int[] myArray = new int[]{ 17, 89, 34, 56, 76, 23};
        System.out.println(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(new int[]{17, 89, 34, 56, 76, 23}));

        int[] oneToFive = new int[]{1, 2, 3, 4, 5};
        int[] sixToTen = new int[]{6, 7, 8, 9, 10};

        System.out.println(oneToFive[1] * sixToTen[2]);

        int[][] twoDimArray = {
                        {3, 4, 7, 9, 0},
                        {12, 67, 87, 23},
                        {77, 654, 78, 90},
                        {345, 653, 60, 765}
                };

        System.out.println(twoDimArray[1][1]);
        System.out.println(twoDimArray[2][3]);

        System.out.println(twoDimArray[3][0] * twoDimArray[1][1]);

// NESTED FOR LOOP>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        for(int row = 0; row < twoDimArray.length; row++){

            System.out.println("ROW:" + row);

            for(int column = 0; column < twoDimArray[row].length; column++){

                System.out.println("COLUMN:" + column);

                System.out.println("[ ROW: " + row + "][ COLUMN:" + column + " ]:"
                        + twoDimArray[row][column] + "\n");
                //NESTED FOR LOOP^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            }
        }



    }
}
