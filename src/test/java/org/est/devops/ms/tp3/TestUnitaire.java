package org.est.devops.ms.tp3;

// import org.est.devops.ms.tp3.Student;

public class TestUnitaire {
    public static void main(String[] args) {
        System.out.println("===== TESTS UNITAIRES DE LA CLASSE STUDENT =====");

        // Test 1 : Création d'un étudiant avec une note initiale
        try {
            Student student1 = new Student("S1", "Alice", 15.0);
            System.out.println("Test 1 - Création Étudiant: ✅ OK");
            System.out.println("Note attendue: 15.0 | Note obtenue: " + student1.getGrade());
        } catch (Exception e) {
            System.out.println("Test 1 - ❌ KO: " + e.getMessage());
        }

        // Test 2 : Mise à jour de la note avec une valeur valide
        try {
            Student student2 = new Student("S2", "Bob", 10.0);
            student2.updateGrade(18.5);
            double note = student2.getGrade();
            System.out.println("Test 2 - Mise à jour note valide: ✅ OK");
            System.out.println("Note attendue: 18.5 | Note obtenue: " + note);
        } catch (Exception e) {
            System.out.println("Test 2 - ❌ KO: " + e.getMessage());
        }

        // Test 3 : Mise à jour de la note avec une valeur invalide < 0
        try {
            Student student3 = new Student("S3", "Charlie", 12.0);
            student3.updateGrade(-5);
            System.out.println("Test 3 - ❌ KO: Aucune exception levée");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 3 - ✅ OK: Exception attendue levée -> " + e.getMessage());
        }

        // Test 4 : Mise à jour de la note avec une valeur invalide > 20
        try {
            Student student4 = new Student("S4", "Diana", 13.0);
            student4.updateGrade(25);
            System.out.println("Test 4 - ❌ KO: Aucune exception levée");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 4 - ✅ OK: Exception attendue levée -> " + e.getMessage());
        }
    }
}

