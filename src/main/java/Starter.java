import school.GradeBook;
import school.Subject;

import java.util.LinkedList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {

        //utworzenie dziennika
        GradeBook gradeBook1 = new GradeBook("Maciek", new LinkedList<>());
        //pobranie listy przdmiotow
        System.out.println(gradeBook1.getSubjectList());
        //utworenie przedmiotu
        Subject subject = new Subject("Math",new LinkedList<>());
        //pobranie listy ocen
        System.out.println(subject.getMarks());
        //dodanie przedmiotu do dziennika
        gradeBook1.addSubject(gradeBook1,subject);
        //pokaznie listy przedmiotow w dzienniku
        System.out.println(gradeBook1.getSubjectList());
        //dodanie oceny do przedmiotu math
        subject.addMark(subject,5);
        subject.addMark(subject,3);
        //pokazanie listy ocen do przedmiotu
        System.out.println(subject.getMarks());
        //srednia z ocen z konkretnego przedmiotu
        System.out.println(subject.marksAverange(subject));
        //srednia wszystkich ocen z wszystkich przemiotow
        System.out.println(gradeBook1.averangeAll(gradeBook1));
        //dodaje nowy przedmiot
        Subject polski = new Subject("Polski",new LinkedList<>());
        gradeBook1.addSubject(gradeBook1,polski);
        polski.addMark(polski, 4);
        polski.addMark(polski, 1);
        polski.addMark(polski, 6);
        //srednia dla poslki
        System.out.println(polski.marksAverange(polski));
        //srednia dla wszustkich z tego dzienniczka
        System.out.println(gradeBook1.averangeAll(gradeBook1));

    }
}
