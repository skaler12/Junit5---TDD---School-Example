package school;

import java.util.List;
import java.util.Objects;

public class GradeBook {
    private String studentName;
    private List<Subject> subjectList;


    public GradeBook(String studentName, List<Subject> subjectList) {
        this.studentName = studentName;
        this.subjectList = subjectList;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public boolean addSubject(GradeBook gradeBook, Subject subject){
        return gradeBook.getSubjectList().add(subject);
    }
    public double averangeAll(GradeBook gradeBook){
        double liczba = 0;
        for(int i = 0; i<= gradeBook.getSubjectList().size()-1; i++){

            liczba = liczba + gradeBook.getSubjectList().get(i).marksAverange(gradeBook.getSubjectList().get(i));
        }
        double avg = (double)(liczba/gradeBook.getSubjectList().size());
        return avg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeBook gradeBook = (GradeBook) o;
        return Objects.equals(studentName, gradeBook.studentName) &&
                Objects.equals(subjectList, gradeBook.subjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, subjectList);
    }

    @Override
    public String toString() {
        return "GradeBook{" +
                "studentName='" + studentName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
