public class Student {
    private int id;
    private String lastName;
    private String name;
    private int years;
    private int grade;

    public Student(int id, String lastName, String name, int years, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.years = years;
        this.grade = grade;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", years=" + years +
                ", grade=" + grade +
                '}';
    }
}
