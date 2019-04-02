package notesForClass;

public class Employee {

    public String firstName;
    public String lastName;
    public double earnings;



    public Employee(String firstName, double earnings){

        this.firstName = firstName;
        this.earnings = earnings;
    }

    public Employee(String firstName, String lastName, double earnings){
        this.firstName = firstName;
        this.lastName = lastName;
        this.earnings = earnings;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", earnings=" + earnings +
                '}';
    }

    public String calculateEarnings(double earnings){
        return "I'm about to start making " + earnings + " dollars";
    }
}
