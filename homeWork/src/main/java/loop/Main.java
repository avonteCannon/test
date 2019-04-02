package loop;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        while (x >= 1){
            if( x == 7){
                System.out.println("LUCKY NUMBER " + x);
                break;
            }
            System.out.println(x);
            x--;
        }

        String riddle = ("She sells seashells by the seashore.\n" +
                "The shells she sells are surely seashells.\n" +
                "So if she sells shells on the seashore,\n" +
                "I'm sure she sells seashore shells");
        String[] word = riddle.split(" ");

        int counter = 0;

        for( int s = 0; s < word.length; s++){

            if(word[s].equalsIgnoreCase("SELLS")){
                counter++;
                continue;
            }
            System.out.println("sells" + counter);
        }



    }
}
