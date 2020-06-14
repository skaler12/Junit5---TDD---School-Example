package school;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    GradeBook gradeBook = new GradeBook("Michał", new LinkedList<>());
    Subject subject = new Subject("Math",new LinkedList<>());

    @BeforeClass
    public static void startMessage() {
        System.out.println("Let's start tests!");
    }

    @Test
    void addMark() {
         {
            gradeBook.addSubject(gradeBook,subject);
            Assert.assertTrue(subject.addMark(subject,5));
        }
    }

    @Test
    void marksAverange() {
        subject.addMark(subject,5);
        subject.addMark(subject,3);
        double suma=0;
        for(int i=0; i<=subject.getMarks().size()-1; i++){
            suma = suma + subject.getMarks().get(i);
        }
        double srednia;
        srednia = suma/subject.getMarks().size();
        Assert.assertEquals(4.0,srednia,0.01);
    }
}