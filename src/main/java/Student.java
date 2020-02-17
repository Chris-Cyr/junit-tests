import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    ArrayList<Double> grades;

    public static void main(String[] args) {
        ArrayList<Double> chrisGrades = new ArrayList<>();
        Student chris = new Student("Chris", 17, chrisGrades);
        chrisGrades.add(100.);
        chrisGrades.add(95.);
        chrisGrades.add(97.);
        System.out.println(chris.getGradeAverage());

    }


    public Student(String name, long id, ArrayList<Double> grades){
        this.name = name;
        this.id = id;
        this.grades = grades;

    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(double grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        Double sum = 0.0;
        for (Double grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
}
