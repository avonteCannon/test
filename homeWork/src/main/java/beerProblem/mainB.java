package beerProblem;

public class mainB {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else{
                System.out.println("No more bottles of beer on the wall");
            } //problem is "1 bottles of beer on the wall"
            String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "Front end"};
            String[] wordListTwo = {"empowered", "oriented", "centric", "distributed", "positioned"};
            String[] wordListThree = {"process", "tipping-point", "mission"};

            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
            System.out.println("What we need is a " + phrase);
        }

    }
}
