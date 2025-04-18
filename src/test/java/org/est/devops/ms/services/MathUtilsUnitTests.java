package org.est.devops.ms.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsUnitTests {
    @Test
    void testAddition() {

        // // Arrange
        // // Test Data
        // int a = 5;
        // int b = 10;
        
        MathUtils mathUtils = new MathUtils();
        // Act
        int result = mathUtils.addition(5, 10);
        
        //Assert
        Assertions.assertEquals(15, result);
    }

    @Test
    void testSoustraction() {

        // // Arrange
        // // Test Data
        // int a = 5;
        // int b = 10;
        
        MathUtils mathUtils = new MathUtils();
        // Act
        int result = mathUtils.soustraction(5, 10);
        
        //Assert
        Assertions.assertEquals(-5, result);
    }

    @Test
    void testMultiplication() {

        // // Arrange
        // // Test Data
        // int a = 5;
        // int b = 10;
        
        MathUtils mathUtils = new MathUtils();
        // Act
        int result = mathUtils.multiplication(5, 10);
        
        //Assert
        Assertions.assertEquals(50, result);
    }

    @Test
    void testDivision() {
        
        MathUtils mathUtils = new MathUtils();
        // Act  
        int result = mathUtils.division(10, 0);
        
        //Assert
        Assertions.assertEquals(2, result);
    }
}
