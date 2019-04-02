package printF;

public class Main {
    public static void main(String[] args) {
        //printF EXAMPLES
        System.out.printf("%b", 10<=10);
        System.out.printf("%b", null);
        System.out.printf("%c", 'A');

        //RIGHT JUSTAFIED
        System.out.printf("%3d", 1234567);
        System.out.printf("%3d", -999999);

        //LEFT JUSTAFIED
        System.out.printf("%-3d", 1234567);
        System.out.printf("%-3d", -999999);

        //Add Zero
        System.out.printf("%03d",9);
        System.out.printf("%03d",20);
        System.out.printf("%03d", -20);

        //spaceFive
        System.out.printf("'%5d'", 123);
        System.out.printf("'%+5d'", 123);

        //formatting floating point
        System.out.printf("'%.1f'", 99.57);
        System.out.printf("'%08.2f'", 99.57);

        //String Format
        System.out.printf("'%s'", "YaYa");
        System.out.printf("'%10s'", "YaYa");

        //SPECIAL
        System.out.printf("Ya\tYa");
        System.out.printf("Ya\nYa");

        //Loop Lecture (if)
        String dayOfTheWeek = "Friday";
        boolean isPayDay = true;

        if(dayOfTheWeek.equals("Friday") && isPayDay == true){
            System.out.println("where the party at?");
        }else if(dayOfTheWeek.equals("Thursday")){
            System.out.println("F..it more homework from mikaila");
        }else if(dayOfTheWeek.equals("Thursday")){
            System.out.println("F..it more homework from mikaila");
        }else{
            System.out.println("waka flocka");
        }

        //(for) Loops
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        int x = 1;
        while(x < 11){
            System.out.println(x);
            x++;
        }

        int v = 10;
        while(v > 0){
            System.out.println(v);
            v--;
        }
        int a = 10;
        while(a > 0){
            System.out.println(a);
            a-=2;
        }
        int j = 9;
        while(j > 0){
            System.out.println(j);
            j-=2;
        }



    }
}
