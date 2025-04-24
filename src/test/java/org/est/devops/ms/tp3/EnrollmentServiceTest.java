package org.est.devops.ms.tp3;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnrollmentServiceTest {

    @Test
    void testEnrollmentNotification() {
        // Capture de la sortie console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Arrange
        Student student = new Student("S5", "Eve", 16.0);
        Course course = new Course("Mathématiques", "Mr. Dupont");
        NotificationService notificationService = new NotificationService();
        EnrollmentService enrollmentService = new EnrollmentService(notificationService);

        // Act
        enrollmentService.enroll(student, course);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Eve has enrolled in Mathématiques taught by Mr. Dupont"),
                "Le message de notification doit apparaître dans la console");
    }
}
