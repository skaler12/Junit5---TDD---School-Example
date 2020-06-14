package school;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Subject{

    private String subjectName;
    private List<Integer>marks;

    public Subject(String subjectName, List<Integer> marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    boolean addMark(Integer mark, Subject subject){
        return subject.getMarks().add(mark);
    }
    public double marksAverange(Subject subject){
        double sum = subject.getMarks().stream().mapToInt(Integer::intValue).sum();
        double averenge = (double)(sum/subject.getMarks().size());
        return averenge;
    }
    public boolean addMark(Subject subject, int mark){
        return subject.getMarks().add(mark);
    }
    public int sumAll(Subject subject){
       int sum = subject.getMarks().stream().mapToInt(Integer::intValue).sum();
       return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectName, subject.subjectName) &&
                Objects.equals(marks, subject.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName, marks);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
