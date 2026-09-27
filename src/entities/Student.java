package entities;

public class Student extends Person{

    private String email;
    private String numberCard;
    private String grade;
    private String subject;


    public Student() {
        super();
    }

    public Student(Long id, String name, String gender, String phone, String email, String numberCard, String grade, String subject) {
        super(id, name, gender, phone);
        this.email = email;
        this.numberCard = numberCard;
        this.grade = grade;
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
