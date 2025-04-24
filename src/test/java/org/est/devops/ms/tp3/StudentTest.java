package org.est.devops.ms.tp3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testStudentCreation() {
        Student student = new Student("S1", "Alice", 15.0);
        assertEquals(15.0, student.getGrade(), "La note initiale doit être 15.0");
    }

    @Test
    void testUpdateGradeValid() {
        Student student = new Student("S2", "Bob", 10.0);
        student.updateGrade(18.5);
        assertEquals(18.5, student.getGrade(), "La note doit être mise à jour à 18.5");
    }

    @Test
    void testUpdateGradeInvalidNegative() {
        Student student = new Student("S3", "Charlie", 12.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            student.updateGrade(-2.0);
        });
        assertEquals("Invalid grade", exception.getMessage());
    }

    @Test
    void testUpdateGradeInvalidOver20() {
        Student student = new Student("S4", "Diana", 13.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            student.updateGrade(25.0);
        });
        assertEquals("Invalid grade", exception.getMessage());
    }
}
