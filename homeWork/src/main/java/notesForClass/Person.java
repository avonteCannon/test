package notesForClass;

//class
public class Person {

    //variables
    public int age;
    public String name;
    public String favSport;
    public int salary;
    public String occupation;

    //constructor : Has to be the same name as the class
    public Person(){
    }

    public Person(int age, String name, String favSport, int salary, String occupation){
        this.age = age;
        this.name = name;
        this.favSport = favSport;
        this.salary = salary;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favSport='" + favSport + '\'' +
                ", salary=" + salary +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    //method: 1). Identiy 2).State 3). Behaivor
    public String aboutMyLife(){
        return "My name is " + name + " and I am " + age + " years old. My Favorite sports is " + favSport + " and by this time next year my occupation will be " + occupation + " meaning I could be making up to " + salary +" yearly!";
    }

}
