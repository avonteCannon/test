package dayTwo;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] examScores;

    public Student(String firstName, String lastName, Double[] examScores) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }
    public Double[] getExamScores(){
        return examScores;
    }
    }

