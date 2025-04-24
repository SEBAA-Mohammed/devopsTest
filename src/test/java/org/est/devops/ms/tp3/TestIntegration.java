package org.est.devops.ms.tp3;

public class TestIntegration {
    public static void main(String[] args) {
        System.out.println("===== TEST D'INTEGRATION =====");

        // Création d’un étudiant
        Student student = new Student("S10", "Eve", 14.0);

        // Création d’un cours
        Course course = new Course("Mathématiques", "Mr. Dupont");

        // Création du service d'inscription avec notification
        NotificationService notifier = new NotificationService();
        EnrollmentService enrollmentService = new EnrollmentService(notifier);

        // Inscription de l’étudiant au cours
        enrollmentService.enroll(student, course);

        // Résultat attendu :
        System.out.println(
                "✔️ Attendu : Message de notification affiché avec nom de l'étudiant, nom du cours et professeur.");
    }
}
