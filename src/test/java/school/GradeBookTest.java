package school;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class GradeBookTest {

    GradeBook gradeBook = new GradeBook("Maciek", new LinkedList<>());
    Subject subject = new Subject("Math", new LinkedList<>());
    Subject subject1 = new Subject("Polish", new LinkedList<>());

    @BeforeClass
    public static void startMessage() {
        System.out.println("Let's start tests!");
    }
    @Test
    void addSubject() {
        Assert.assertTrue(gradeBook.addSubject(gradeBook,subject));
    }

    @Test
    void averangeAll() {

        gradeBook.addSubject(gradeBook,subject);
        subject.addMark(subject,5);
        subject.addMark(subject,2);

        double avg = subject.marksAverange(subject);

        gradeBook.addSubject(gradeBook,subject1);
        subject1.addMark(subject1,1);
        subject1.addMark(subject1,5);

        double avg1 = subject1.marksAverange(subject1);
        double avg2 = (avg+avg1)/2;
        Assert.assertEquals(3.25,avg2,0.001);

    }
}